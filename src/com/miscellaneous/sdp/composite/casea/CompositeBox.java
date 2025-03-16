package com.miscellaneous.sdp.composite.casea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box {
	
	private final List<Box> children = new ArrayList<>();
	
	public CompositeBox(Box ...boxes) {
		this.children.addAll(Arrays.asList(boxes));
	}

	@Override
	public double calculatePrice() {
		return children.stream()
				.mapToDouble(Box::calculatePrice)
				.sum();
	}

}
