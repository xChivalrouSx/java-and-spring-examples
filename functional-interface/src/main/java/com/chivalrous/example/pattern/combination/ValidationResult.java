package com.chivalrous.example.pattern.combination;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ValidationResult {
	SUCCESS("Validation complete with success."),
	PERSON_NAME_NOT_VALID("Name is not valid."),
	PERSON_SURNAME_NOT_VALID("Surname is not valid."),
	PERSON_AGE_NOT_VALID("Age is not valid.");

	private String explanation;
}
