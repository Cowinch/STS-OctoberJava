package com.cole.ZooKeeper.models;

public class Gorilla extends Mammal {
	
	//constructors
	public Gorilla() {}

	public Gorilla(double energyStart) {
		this.energyLevel=energyStart;
	}
	
	
	//methods
//	public void throwSomething(String object){
//		this.energyLevel-=5;
//		System.out.println("We threw "+object+"! energy decreased by 5\n remaining energy: "+this.energyLevel);
//	}
	public void eatBananas(){
		this.energyLevel+=10;
		System.out.println("Nom nom, bananas yummy. energy increased by 10\n remaining energy: "+this.energyLevel);
	}
	public void climb(){
		this.energyLevel-=10;
		System.out.println("we climbed a tree! Now we can eat bananas! energy decreased by 10\n remaining energy: "+this.energyLevel);
	}
}
