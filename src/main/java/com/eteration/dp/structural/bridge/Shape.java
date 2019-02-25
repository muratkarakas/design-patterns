package com.eteration.dp.structural.bridge;
public abstract class Shape {
	//Composition - implementor
	protected Color color;
	
	//constructor with implementor as input argument
	public Shape(Color c){
		this.color=c;
	}
	
	public abstract void applyColor();
}