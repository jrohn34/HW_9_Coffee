package edu.iu.habahram.coffeeorder.Security;

import edu.iu.habahram.coffeeorder.model.Customer;
import edu.iu.habahram.coffeeorder.repository.CustomerRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsSecurtiyService implements UserDetailsService {
    CustomerRepository customerRepository;

    public UserDetailsSecurtiyService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException{
        try{
            Customer customer = customerRepository.findByUsername(username);
            if (customer == null) {
                throw new UsernameNotFoundException("");
            }
            return User
                    .withUsername(username)
                    .password(customer.password())
                    .build();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}