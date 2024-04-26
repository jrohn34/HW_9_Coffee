package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.BeverageData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderFileRepository
        extends CrudRepository<BeverageData, Integer> {
    BeverageData findByName(String name);
}
