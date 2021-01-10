package com.objectmaster.characters;

import com.objectmaster.Human;

public class Wizard extends Human {
	int health = 50;
	int intelligence = 8;
	protected void heal(Human charecter) {
		charecter.setHealth(charecter.getHealth() + this.intelligence);
	}
	protected void fireball(Human charecter) {
		charecter.setHealth(charecter.getHealth() - (this.intelligence*3));
	}
}