package com.miscellaneous;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		Supplier<String> dataSupplier = () -> {
			// Logic to fetch or generate new data
			return fetchData();
		};

		Stream<String> infiniteStream = Stream.generate(dataSupplier);

		infiniteStream.limit(1000).forEach(System.out::println);
	}

	private static String fetchData() {
		return "new data";
	}

}
