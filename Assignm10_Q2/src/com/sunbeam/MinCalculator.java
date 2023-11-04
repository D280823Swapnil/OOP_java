package com.sunbeam;

public class MinCalculator {

	public static <N extends Number> N getMin(N[] inputArray) {
		N keyElement = inputArray[0];

		for (N element : inputArray) {
			if (keyElement.doubleValue() > element.doubleValue()) {
				keyElement = element;
			}
		}

		return keyElement;
	}

}
