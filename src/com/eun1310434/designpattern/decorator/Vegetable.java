package com.eun1310434.designpattern.decorator;

public class Vegetable extends ToppingDecorator {

	public Vegetable(Pizza newPizza) {
		super(newPizza);
	}
	
	public String getDescription(){
		return tempPizza.getDescription() + ", Vegetable";
	}
	
	public double getCost(){
		System.out.println("Vegetable : " + .90);
		return tempPizza.getCost() + .90;
	}
}