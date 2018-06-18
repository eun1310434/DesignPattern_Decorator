package com.eun1310434.designpattern.decorator;

public class PizzaMaker {
	
	public static void main(String[] args){		
		System.out.println("====================Basic Pizza====================");
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
		
		System.out.println();
		System.out.println("====================Meat Pizza====================");
		Pizza meatPizza = new Meat(new TomatoSauce(new Mozzarella(new PlainPizza())));
		System.out.println("Ingredients: " + meatPizza.getDescription());
		System.out.println("Price: " + meatPizza.getCost());
		
		System.out.println();
		System.out.println("====================Veggi Pizza====================");
		Pizza VeggiPizza = new Vegetable((new PlainPizza()));
		System.out.println("Ingredients: " + VeggiPizza.getDescription());
		System.out.println("Price: " + VeggiPizza.getCost());

		System.out.println();
		System.out.println("====================Combination Pizza====================");
		Pizza ComPizza = new Vegetable(new Meat(new TomatoSauce(new Mozzarella(new PlainPizza()))));
		System.out.println("Ingredients: " + ComPizza.getDescription());
		System.out.println("Price: " + ComPizza.getCost());
	}
	
}