package com.eun1310434.designpattern.decorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza and adds " mozzarella" to it
	public String getDescription(){
		return tempPizza.getDescription() + ", mozzarella";
	}
	
	public double getCost(){
		System.out.println("Mozzarella : " + .50);
		return tempPizza.getCost() + .50;
	}
}