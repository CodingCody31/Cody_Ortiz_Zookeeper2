package com.zookeeper.mammal;

public class Bat extends Mammal {
	
	public int fly(int fly) {
		System.out.println("*Flap* *Flap* *Fwoosh*");
		energyLevel = energyLevel - (fly*50);
		return energyLevel;
	}
	
	public int eatHumans(int eat) {
		System.out.println("Death from above! The bat is try to eat me aaaggghh...");
		energyLevel = energyLevel + (eat*25);
		if (energyLevel > 300)
			energyLevel = 300;
		return energyLevel;
	}
	
	public int attackTown(int atk) {
		System.out.println("*Crash* *Crash* *Burning Building*");
		energyLevel = energyLevel - (atk*100);
		return energyLevel;
	}

}
