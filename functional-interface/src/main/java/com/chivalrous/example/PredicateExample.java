package com.chivalrous.example;

import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PredicateExample {

	private static final Predicate<String> isEmailValid = value -> value.indexOf("@") != -1 &&
			value.indexOf("@") != 0 && value.indexOf("@") != value.length() - 1;

	private static final Predicate<String> isEducationalEmail = value -> value.indexOf("@") != -1 &&
			value.indexOf(".edu") != -1 && value.indexOf(".edu") > value.indexOf("@");

	public static void main(String[] args) {
		log.info("'isEmailValid' predicate result for 'test@test.com': {}", String.valueOf(isEmailValid.test("test@test.com")));
		log.info("'isEmailValid' predicate result for '@test.com': {}", String.valueOf(isEmailValid.test("@test.com")));
		log.info("'isEmailValid' predicate result for 'test@': {}", String.valueOf(isEmailValid.test("test@")));
		log.info("'isEmailValid' predicate result for 'test-email-dot-com': {}", String.valueOf(isEmailValid.test("test-email-dot-com")));

		log.info("'isEmailValid' predicate negate result for 'test@test.com.tr': {}", String.valueOf(isEmailValid.negate().test("test@test.com.tr")));

		log.info("'isEmailValid' and 'isEducationalEmail' predicate result for 'test@test.com.tr': {}",
				String.valueOf(isEmailValid.and(isEducationalEmail).test("test@test.com.tr")));
		log.info("'isEmailValid' and 'isEducationalEmail' predicate result for 'test@test.edu.tr': {}",
				String.valueOf(isEmailValid.and(isEducationalEmail).test("test@test.edu.tr")));
		log.info("'isEmailValid' and 'isEducationalEmail' predicate result for 'test.edu@test.com': {}",
				String.valueOf(isEmailValid.and(isEducationalEmail).test("test.edu@test.com")));
	}

}