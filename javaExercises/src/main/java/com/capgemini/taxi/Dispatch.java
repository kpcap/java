package com.capgemini.taxi;

import java.util.ArrayList;
import java.util.List;

public class Dispatch {
	private static List<Taxi> baza = new ArrayList<Taxi>();
	
	static {
		for(int i=0; i<25; i++) {
			baza.add(new Taxi(i, i+1, false));
		}
	}
	
	public static int receiveCall(int distance) {
		for(int i=0; i<baza.size(); i++) {
			if(baza.get(i).getDistance() <= distance) {
				 sendTaxi(baza.get(i).getId());
				 return 1;
			}
		}
		return 0;
	}
	
	public static void sendTaxi(int taxi_id) {
		for(int i=0; i<baza.size(); i++) {
			if(baza.get(i).getId() == taxi_id) {
				baza.get(i).setOccupied();
			}
		}
	}
	
}