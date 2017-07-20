package com.eteration.dp.behavioral.visitor;
public interface Visitor{
  public void visit(Book book);
  
  //visit other concrete items
  public void visit(CD cd);
  public void visit(DVD dvd);
}