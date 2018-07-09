package com.study.pattern.stretegy2;

public class GameCharacter {
	
	// ������
	private Weapon weapon;

	// ���� ��ȯ�� �����ϰ�
	public void setWepon(Weapon weapon) {
		this.weapon = weapon;
	}
	// ��� ���
	public void fire() {
		if(weapon == null) {
			System.out.println("���⸦ ���� �����ϼ���.");
		} else {
			weapon.shoot();
		}
	}
}
