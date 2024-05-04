package com.chivalrous.example;

import java.util.function.BiFunction;
import java.util.function.Function;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionExample {

	@SuppressWarnings("java:S4276")
	private static final Function<String, Integer> getLength = String::length;

	@SuppressWarnings("java:S4276")
	private static final Function<Integer, Integer> addOne = value -> value + 1;

	@SuppressWarnings("java:S4276")
	private static final BiFunction<Integer, Integer, Integer> addCustom = (value, valueToAdd) -> value + valueToAdd;

	public static void main(String[] args) {
		int getLengthResult = getLength.apply("Hello Java Function!..");
		log.info("getLength Result for input 'Hello Java Function!..': {}", getLengthResult);

		int addOneResult = addOne.apply(0);
		log.info("addOne Result for input '0': {}", addOneResult);

		int addCustomResult = addCustom.apply(2, 3);
		log.info("addCustom Result for input '2' and '3': {}", addCustomResult);

		int complexResult = getLength.andThen(addOne).apply("This is more complex one.");
		log.info("addOne after getLength with andThen Result for input 'This is more complex one.': {}", complexResult);

		int composeResult = addOne.compose(getLength).apply("The third test with compose.");
		log.info("addOne after getLength with compose Result for input 'The third test with compose.': {}", composeResult);
	}

}