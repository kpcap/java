package com.capgemini.taxi;

public class Taxi {
	private int id;
	private int distance;
	private boolean occupied;
	
	public Taxi(int _id, int _distance, boolean _occupied) {
		id = _id;
		distance = _distance;
		occupied = _occupied;
	}
	
	public int getId() {
		return id;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	
	public void setOccupied() {
		occupied = true;
	}
}