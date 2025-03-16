package com.miscellaneous.serialization;

public class DemoSerialization {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		PlaneSingleton ps = PlaneSingleton.getInstance();
		ps.setId(100);
		ps.setName("venkat");
		
		Serialization.perform(ps, "resources/planeSingleton.ser");
		System.out.println(ps.hashCode());
		System.out.println(ps.clone().hashCode());
		
		ps.setId(200);
		ps.setName("raman");
		System.out.println(ps.hashCode());
		System.out.println(ps.clone().hashCode());
		
		PlaneSingleton dps = (PlaneSingleton) DeSerialization.perform("resources/planeSingleton.ser");
		System.out.println(dps);
		System.out.println(dps.hashCode());
	}

}
