package org.example;

import java.util.Scanner;

public class PizzaOrder {
    double givenNoOfPizzaAndPriceOfPizzaCalculate(int noOfPizza, double priceOfPizza){
        return noOfPizza*priceOfPizza;
    }
    double givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculate(int noOfGarlicBread, double priceOfGarlic){
        return noOfGarlicBread*priceOfGarlic;
    }
    double givenNoOfBeveragesAndPriceOfBeverageCalculate(int noOfBeverage, double priceOfBeverage){
        return noOfBeverage*priceOfBeverage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaOrder pizzaorder = new PizzaOrder();
        System.out.println("Enter Number of pizza want to order");
        int noOfPizza = scanner.nextInt();
        System.out.println("Enter The Prize Of Pizza");
        double priceOfPizza = scanner.nextDouble();
       double priceForPizza =  pizzaorder.givenNoOfPizzaAndPriceOfPizzaCalculate(noOfPizza, priceOfPizza);
        System.out.println("Total Price Of Pizza : "+priceForPizza);
        System.out.println("Enter Number Of Garlic Bread You want to Order");
        int noOfGarlic = scanner.nextInt();
        System.out.println("Enter Price Of Garlic Bread");
        double priceOfGarlic = scanner.nextDouble();
        double priceForGarlic = pizzaorder.givenNoOfGarlicBreadAndPriceOfGarlicBreadCalculate(noOfGarlic, priceOfGarlic);
        System.out.println("Total Price Of Garlic Bread : "+priceOfGarlic);
        System.out.println("Enter Number of Beverages You want to Order");
        int noOfBeverage = scanner.nextInt();
        System.out.println("Enter Price For Beverages");
        double priceOfBeverages = scanner.nextDouble();
        double priceForBeverages = pizzaorder.givenNoOfBeveragesAndPriceOfBeverageCalculate(noOfBeverage, priceOfBeverages);
        System.out.println("Total Price Of Beverages : "+priceOfBeverages);
    }
}
