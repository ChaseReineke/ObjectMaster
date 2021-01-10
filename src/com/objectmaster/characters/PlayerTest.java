package com.objectmaster.characters;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ninja nin = new Ninja();
		Samurai sam = new Samurai();
		Samurai sam2 = new Samurai();
		Samurai sam3 = new Samurai();
		Samurai sam4 = new Samurai();
		Wizard wiz = new Wizard();
		
		nin.steal(sam);
		sam.meditate();
		wiz.fireball(sam);
		nin.runAway();
		sam.deathBlow(wiz);
		wiz.heal(wiz);
		System.out.println(nin.getHealth());
		System.out.println(wiz.getHealth());
		System.out.println(sam.getHealth());
		System.out.println(sam.howMany());
	}

}

