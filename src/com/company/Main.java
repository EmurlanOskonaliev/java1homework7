package com.company;

public class Main {

    public static void main(String[] args) {
    	Magic magic = new Magic();
    	Medic medic = new Medic();
    	Warrior warrior = new Warrior();

    	Hero  [] heroes = {
    	medic, magic, warrior
    	};

		for (int i = 0; i < heroes.length; i++) {
			heroes [i].applySuperAbility();
		}

	}
 }
