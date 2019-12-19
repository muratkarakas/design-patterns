package com.eteration.dp.behavioral.observer;

public class ObserverTest {

	public static void main(String[] args) {
		Subject subject = new Subject();
		HexObserver  ho = new HexObserver(subject);
		OctObserver oo = new OctObserver(subject);
		HexObserver  ho2 = new HexObserver(subject);
		
		subject.setState(100);

	}

}
