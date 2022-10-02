package com.cole.ZooKeeper.models;

public class Mammal {
	//default energy level is 100, unless specified otherwise.
	protected double energyLevel=100;
	
	public double displayEnergy(){
		return this.energyLevel;
	}
	
	//this function was brought from Gorilla. we're allowing all mammals to throw.
	public void throwSomething(String object){
		this.energyLevel-=5;
		System.out.println("We threw "+object+"! energy decreased by 5\n remaining energy: "+this.energyLevel);
	}

}
