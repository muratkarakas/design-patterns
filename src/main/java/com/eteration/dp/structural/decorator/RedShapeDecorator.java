package com.eteration.dp.structural.decorator;
public class RedShapeDecorator extends ShapeDecorator {

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();	       
      setColor();
   }

   private void setColor(){
      System.out.println("Red");
   }
}