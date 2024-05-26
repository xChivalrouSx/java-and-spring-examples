package com.chivalrous.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionalInterfaceExample {

	@FunctionalInterface
	private interface Computable {
		int compute(int x, int y, int z);
	}

	public static void main(String[] args) {
		computeAndPrintResult((x, y, z) -> x + y + z);
		computeAndPrintResult((x, y, z) -> x * y * z);
		computeAndPrintResult((x, y, z) -> x - y - z);
	}

	private static void computeAndPrintResult(Computable computable) {
		int firstValue = 5;
		int secondValue = 10;
		int thirdValue = 0;
		log.info("Values: {}, {}, {}", firstValue, secondValue, thirdValue);
		log.info("Computed Value: {}", computable.compute(firstValue, secondValue, thirdValue));
	}

}