package com.eteration.dp.structural.adapter;
public class PaladinAdapter implements Fighter {//Adapter

    private Paladin paladin;

    public PaladinAdapter(Paladin paladin) {
        this.paladin = paladin;
    }

	public void defend() {
		paladin.useShield();
		
	}

	public void attack() {
		paladin.useSword();
		
	}

 

}