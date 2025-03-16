package com.miscellaneous.sdp.facade.casea;

public class FacadeDemoA {

	public static void main(String[] args) {
		FacadePhone facadePhone = new FacadePhone();
		
		String phone = facadePhone.buildIPhone();
		System.out.println(phone);
		
		phone = facadePhone.buildNokiaPhone();
		System.out.println(phone);
		
		phone = facadePhone.buildOnePlusPhone();
		System.out.println(phone);
	}

}
