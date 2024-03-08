package edu.iu.habahram.coffeeorder;

import edu.iu.habahram.coffeeorder.model.*;
import edu.iu.habahram.coffeeorder.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderRepositoryTest {

    private OrderRepository orderRepository;

    @BeforeEach
    public void setUp() {
        orderRepository = new OrderRepository();
    }

    @Test
    public void testDarkRoastOrder() throws Exception {
        OrderData orderData = new OrderData("Dark roast", List.of());
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("Dark roast", receipt.description());
        assertEquals(1.99F, receipt.cost());
    }

    @Test
    public void testDarkRoastWithMilkOrder() throws Exception {
        OrderData orderData = new OrderData("Dark roast", List.of("Milk"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("Dark roast, Milk", receipt.description());
        assertEquals(2.39F, receipt.cost());
    }

    @Test
    public void testDarkRoastWithMochaOrder() throws Exception {
        OrderData orderData = new OrderData("Dark roast", List.of("Mocha"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("Dark roast, Mocha", receipt.description());
        assertEquals(2.29F, receipt.cost());
    }

    @Test
    public void testEspressoOrder() throws Exception {
        OrderData orderData = new OrderData("Espresso", List.of());
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("Espresso", receipt.description());
        assertEquals(1.99F, receipt.cost());
    }

    @Test
    public void testEspressoWithMilkOrder() throws Exception {
        OrderData orderData = new OrderData("Espresso", List.of("Milk"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("Espresso, Milk", receipt.description());
        assertEquals(2.39F, receipt.cost());
    }

    @Test
    public void testEspressoWithMochaOrder() throws Exception {
        OrderData orderData = new OrderData("Espresso", List.of("Mocha"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("Espresso, Mocha", receipt.description());
        assertEquals(2.29F, receipt.cost());
    }

    @Test
    public void testHouseBlendOrder() throws Exception {
        OrderData orderData = new OrderData("House Blend", List.of());
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("House Blend", receipt.description());
        assertEquals(1.99F, receipt.cost());
    }

    @Test
    public void testHouseBlendWithMilkOrder() throws Exception {
        OrderData orderData = new OrderData("House Blend", List.of("Milk"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("House Blend, Milk", receipt.description());
        assertEquals(2.39F, receipt.cost());
    }

    @Test
    public void testHouseBlendWithMochaOrder() throws Exception {
        OrderData orderData = new OrderData("House Blend", List.of("Mocha"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("House Blend, Mocha", receipt.description());
        assertEquals(2.29F, receipt.cost());
    }

    @Test
    public void testHouseBlendWithSoyOrder() throws Exception {
        OrderData orderData = new OrderData("House Blend", List.of("Soy"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("House Blend, Soy", receipt.description());
        assertEquals(2.39F, receipt.cost());
    }

    @Test
    public void testHouseBlendWithWhipOrder() throws Exception {
        OrderData orderData = new OrderData("House Blend", List.of("Whip"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("House Blend, Whip", receipt.description());
        assertEquals(2.39F, receipt.cost(), 0.01);
    }

    @Test
    public void testDarkRoastWithSoyAndWhipOrder() throws Exception {
        OrderData orderData = new OrderData("Dark Roast", List.of("Soy", "Whip"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("Dark roast, Soy, Whip", receipt.description());
        assertEquals(2.79F, receipt.cost(), 0.01);
    }

    @Test
    public void testEspressoWithMilkAndMochaOrder() throws Exception {
        OrderData orderData = new OrderData("Espresso", List.of("Milk", "Mocha"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("Espresso, Milk, Mocha", receipt.description());
        assertEquals(2.69F, receipt.cost());
    }

    @Test
    public void testHouseBlendWithMilkMochaAndWhipOrder() throws Exception {
        OrderData orderData = new OrderData("House Blend", List.of("Milk", "Mocha", "Whip"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("House Blend, Milk, Mocha, Whip", receipt.description());
        assertEquals(3.09F, receipt.cost(), 0.01);
    }

    @Test
    public void testEspressoWithSoyAndWhipOrder() throws Exception {
        OrderData orderData = new OrderData("Espresso", List.of("Soy", "Whip"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("Espresso, Soy, Whip", receipt.description());
        assertEquals(2.79F, receipt.cost(), 0.01);
    }

    @Test
    public void testDarkRoastWithMilkAndMochaOrder() throws Exception {
        OrderData orderData = new OrderData("Dark Roast", List.of("Milk", "Mocha"));
        Receipt receipt = orderRepository.add(orderData);
        assertEquals("Dark roast, Milk, Mocha", receipt.description());
        assertEquals(2.69F, receipt.cost(), 0.01);
    }
}
