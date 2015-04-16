package com.capgemini.taxi;

public class Customer {
	private int position;
	
	public Customer(int _position) {
		position = _position;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void callDispatch() {
		Dispatch.receiveCall(position);
	}
}
