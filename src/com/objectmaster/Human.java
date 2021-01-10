package com.objectmaster;

public class Human {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	private int health = 100;
	protected void attack(Human person) {
		person.setHealth(person.getHealth() - this.strength);
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
}