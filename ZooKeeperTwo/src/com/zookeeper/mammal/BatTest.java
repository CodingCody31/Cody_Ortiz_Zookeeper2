package com.zookeeper.mammal;

public class BatTest {
	public static void main (String[] args) {
		Bat dracula = new Bat();
		dracula.displayEnergy();
		dracula.attackTown(3);
		dracula.eatHumans(2);
		dracula.fly(2);
		dracula.displayEnergy();
	}
}
