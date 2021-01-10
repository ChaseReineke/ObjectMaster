package com.objectmaster.characters;

import com.objectmaster.Human;

public class Samurai extends Human {
	private static int counter;
	public Samurai() {
		counter++;
	}
	protected int howMany() {
	    return counter;
	}
	

	int health = 200;
	protected void deathBlow(Human charecter) {
		charecter.setHealth(0);
		this.health = health/2;
	}
	protected void meditate() {
		this.health += health/2;
	}
}