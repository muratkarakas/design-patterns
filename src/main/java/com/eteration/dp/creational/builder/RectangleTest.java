package com.eteration.dp.creational.builder;

import com.eteration.dp.creational.builder.Rectangle.RectangleBuilder;

public class RectangleTest {
	public static void main(String[] args) {
		RectangleBuilder rb = new Rectangle.RectangleBuilder("red","1px");
		
		
		Rectangle r = rb.setThreeD(false).setVisible(true).build();
		Rectangle r2 = rb.build();
	}
}
