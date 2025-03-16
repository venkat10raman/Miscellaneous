package com.miscellaneous.sdp.composite.casea;

public class DemoCompositeA {

	public static void main(String[] args) {
		DeliveryService deliveryService = new DeliveryService();
		
		deliveryService.setupOrder(
				new CompositeBox(
						new VideoGame("1", 100),
						new VideoGame("2", 200)
				),
				new CompositeBox(
						new CompositeBox(
							new Book("3", 300),
							new Book("4", 400)
						),
						new VideoGame("5", 500),
						new VideoGame("6", 600)
				)
		);
		
		System.out.println(deliveryService.calculateOrderPrice());
	}

}
