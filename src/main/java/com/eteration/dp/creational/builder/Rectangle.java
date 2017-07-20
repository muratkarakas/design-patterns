package com.eteration.dp.creational.builder;
public class Rectangle {
	
	//required parameters
	private String color;
	private String border;
	
	//optional parameters
	private boolean visible;
	private boolean threeD;
	

	public String getColor() {
		return color;
	}

	public String getBorder() {
		return border;
	}

	public boolean isVisible() {
		return visible;
	}

	public boolean isThreeD() {
		return threeD;
	}
	
	private Rectangle(RectangleBuilder builder) {
		this.color=builder.color;
		this.border=builder.border;
		this.visible=builder.visible;
		this.threeD=builder.threeD;
	}
	
	//Builder Class
	public static class RectangleBuilder{

		//required parameters
		private String color;
		private String border;
		
		//optional parameters
		private boolean visible;
		private boolean threeD;
		
		public RectangleBuilder(String color, String border){
			this.color=color;
			this.border=border;
		}

		public RectangleBuilder setVisible(boolean visible) {
			this.visible = visible;
			return this;
		}

		public RectangleBuilder setThreeD(boolean threeD) {
			this.threeD = threeD;
			return this;
		}
		
		public Rectangle build(){
			return new Rectangle(this);
		}

	}

}