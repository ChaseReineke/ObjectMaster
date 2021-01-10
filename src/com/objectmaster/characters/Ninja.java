package com.objectmaster.characters;

import com.objectmaster.Human;

public class Ninja extends Human {
	int stealth = 10;
	protected void steal(Human charecter) {
		charecter.setHealth(charecter.getHealth() - this.stealth);
	}
	protected void runAway() {
		this.setHealth(this.getHealth()-10);
	}
}