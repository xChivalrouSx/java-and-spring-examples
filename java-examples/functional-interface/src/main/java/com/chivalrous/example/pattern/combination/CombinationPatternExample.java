package com.chivalrous.example.pattern.combination;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CombinationPatternExample {

	private static final String VALIDATION_FOR_LOG_TEXT = "Validation For: {}";
	private static final String VALIDATION_RESULT_LOG_TEXT = "Validation Result: {}";
	private static final String LOG_SEPERATOR = "-----";

	public static void main(String[] args) {
		validatePerson(new Person("Person-Name", "Person-Surname", 25));
		validatePerson(new Person("N", "S", 25));
		validatePerson(new Person("Name", "S", 25));
		validatePerson(new Person("Name", "Surname", 15));
	}

	private static void validatePerson(Person person) {
		ValidationResult validationResult = PersonValidation.validate()
				.isNameValid()
				.isSurnameValid()
				.isAgeValid()
				.apply(person);
		log.info(VALIDATION_FOR_LOG_TEXT, person);
		log.info(VALIDATION_RESULT_LOG_TEXT, validationResult.getExplanation());
		log.info(LOG_SEPERATOR);
	}

}