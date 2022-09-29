package com.cole.ZooKeeper;

import com.cole.ZooKeeper.models.Bat;
import com.cole.ZooKeeper.models.Gorilla;

public class TestAnimal {

	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		
		gorilla1.throwSomething("a rock");
//		System.out.println("Energy level: "+gorilla1.displayEnergy());
		gorilla1.throwSomething("a stick");
//		gorilla1.throwSomething("the hidden jewel of the jungle");
//		gorilla1.climb();
//		System.out.println("Energy level: "+gorilla1.displayEnergy());
//		gorilla1.eatBananas();
//		gorilla1.eatBananas();
		
		Bat bat1=new Bat();
		bat1.fly();
		bat1.attackTown();
		bat1.attackTown();
		System.out.println("Energy level: "+bat1.displayEnergy());
		bat1.eatHumans();
		bat1.eatHumans();
		bat1.attackTown();
		bat1.fly();
	}

}
