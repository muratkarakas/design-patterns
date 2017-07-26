package com.eteration.dp.structural.decorator;
public class DottedShapeDecorator extends ShapeDecorator {

   public DottedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();	       
      setDots();
   }

   private void setDots(){
      System.out.println("Dotted");
   }
}