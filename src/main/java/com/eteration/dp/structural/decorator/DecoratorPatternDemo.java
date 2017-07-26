package com.eteration.dp.structural.decorator;
public class DecoratorPatternDemo {
   public static void main(String[] args) {

   

      Shape redDottedRectangle = new DottedShapeDecorator(new RedShapeDecorator(new Rectangle()));


      redDottedRectangle.draw();
   }
}