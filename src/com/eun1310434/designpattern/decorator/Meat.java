package com.eun1310434.designpattern.decorator;

public class Meat extends ToppingDecorator {

	public Meat(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription(){
		return tempPizza.getDescription() + ", Meat";
	}
	
	public double getCost(){
		System.out.println("Meat : " + .70);
		return tempPizza.getCost() + .70;
	}
}