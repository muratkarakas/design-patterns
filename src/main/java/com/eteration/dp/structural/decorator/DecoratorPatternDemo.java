package com.eteration.dp.structural.decorator;
public class DecoratorPatternDemo {
   public static void main(String[] args) {

   

      Shape redDottedRectangle = new DottedhapeDecorator(new RedShapeDecorator(new Rectangle()));


      redDottedRectangle.draw();
   }
}