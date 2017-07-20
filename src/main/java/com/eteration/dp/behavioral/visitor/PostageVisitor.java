package com.eteration.dp.behavioral.visitor;

public class PostageVisitor implements Visitor {
	private double totalPostageForCart;

	public void visit(Book book) {

		if (book.getPrice() < 10.0) {
			totalPostageForCart += book.getWeight() * 2;
		}
	}

	public void visit(CD cd) {
	}

	public void visit(DVD dvd) {
	}

	public double getTotalPostage() {
		return totalPostageForCart;
	}
}