package com.eteration.dp.behavioral.state;
public class StateContext {
	private FinancialState currentState;
 
	public StateContext(){
		currentState = new Poor();
	}
 
	public void changeState(FinancialState newState){
		this.currentState = newState;
	}
 
	public void doSomething(){
		this.currentState.spendMoney(this);
	}
}