package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaOrderTest {
    PizzaOrder pizzaorder;

    @Before
    public void setUp() {
        pizzaorder = new PizzaOrder();
    }

    @After
    public void tearDown() {
        pizzaorder = null;
    }

    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceSuccess() {
        assertEquals(64.95, pizzaorder.givenNoOfPizzaAndPriceOfPizzaCalculate(5, 12.99), .001);
    }

    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceSuccess() {
        assertEquals(49.95, pizzaorder.givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculate(5, 9.99), .001);
    }

    @Test
    public void givenNoOfBeverageAndPriceOfBeverageCalculateTotalPriceSuccess() {
       assertEquals(21.29, pizzaorder.givenNoOfBeveragesAndPriceOfBeverageCalculate(5,4.26),.01);
    }
    @Test
    public void givenNoOfPizzaAndPriceOfPizzaCalculateTotalPriceFailure() {
        assertNotEquals(64.84, pizzaorder.givenNoOfPizzaAndPriceOfPizzaCalculate(5, 12.99), .001);
    }

    @Test
    public void givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculateTotalPriceFailure() {
        assertNotEquals(49.96, pizzaorder.givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculate(5, 9.99), .001);
    }

    @Test
    public void givenNoOfBeverageAndPriceOfBeverageCalculateTotalPriceFailure() {
        assertNotEquals(21.27, pizzaorder.givenNoOfBeveragesAndPriceOfBeverageCalculate(5,4.26),.01);
    }
}