package com.eteration.dp.structural.decorator;
public class DottedhapeDecorator extends ShapeDecorator {

   public DottedhapeDecorator(Shape decoratedShape) {
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