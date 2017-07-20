package com.eteration.dp.behavioral.state;
interface FinancialState {
	public void spendMoney(StateContext sc);
}
 
class Rich implements FinancialState{
	
	public void spendMoney(StateContext sc) {
		System.out.println("I'm rick currently, and play a lot.");
		sc.changeState(new Poor());
	}
}
 
class Poor implements FinancialState{
	
	public void spendMoney(StateContext sc) {
		System.out.println("I'm poor currently, and spend much time working.");
		sc.changeState(new Rich());
	}
}