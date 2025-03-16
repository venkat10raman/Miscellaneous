package com.miscellaneous.sdp.facade.casea;

//composition class
public class FacadePhone {
	
	private IPhone iPhone;
	private Nokia nokia;
	private OnePlus onePlus;
	
	public FacadePhone() {
		iPhone = new IPhone();
		nokia = new Nokia();
		onePlus = new OnePlus();
	}
	
	public String buildIPhone() {
		return iPhone.build();
	}
	
	public String buildNokiaPhone() {
		return nokia.build();
	}
	
	public String buildOnePlusPhone() {
		return onePlus.build();
	}

}
