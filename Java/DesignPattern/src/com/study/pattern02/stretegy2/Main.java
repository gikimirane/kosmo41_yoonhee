package com.study.pattern02.stretegy2;

public class Main {
	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		character.fire();
		
		Character.setWepon(new Arrow());
		Character.fire();
		
		Character.setWepon(new Bullet());
		Character.fire();
		
		Character.setWepon(new Missile());
		Character.fire();


	}

}
