package com.eun1310434.designpattern.decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza, Mozzarella and then TomatoSauce
	public String getDescription(){
		return tempPizza.getDescription() + ", tomato sauce";
	}
	
	public double getCost(){
		System.out.println("Tomato Sauce: " + .35);
		return tempPizza.getCost() + .35;
	}
	
}