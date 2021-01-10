package com.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Human player = new Human();
		Human enemy = new Human();
		player.attack(enemy);
		System.out.println(enemy.getHealth());
	}
}