package com.cole.ZooKeeper.models;

public class Bat extends Mammal {
	protected double energyLevel=300;

	//constructor
	public Bat() {
	}
	
	
	//methods
	public void fly() {
		//if statement to check whether we have enough energy.
		if(energyLevel>=50) {
			this.energyLevel-=50;
			System.out.println("Whoosh! The bat has taken off! energy reduced by 50. remaining energy: " + this.energyLevel);
		} else {
			System.out.println("Not enough energy remaining. We're safe for another day!");
		}
	}
	
	public void eatHumans() {
		this.energyLevel+=25;
		System.out.println("MUNCH MUNCH! energy increased by 25. remaining energy: " + this.energyLevel);
	}
	
	public void attackTown() {
		if(energyLevel>=100) {		
			this.energyLevel-=100;
			System.out.println("*The sounds of an entire town burning down.* what have we done. energy reduced by 100. remaing energy: " + this.energyLevel);
		} else {
			System.out.println("Not enough energy remaining. We're safe for another day!");
		}
	}

}
