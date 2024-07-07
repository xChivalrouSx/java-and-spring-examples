package com.chivalrous.example.pattern.combination;

public interface PersonValidation extends Validation<Person> {

	static PersonValidation validate() {
		return person -> ValidationResult.SUCCESS;
	}

	default PersonValidation isNameValid() {
		return and(p -> p.getName() != null && p.getName().length() > 1 ? ValidationResult.SUCCESS : ValidationResult.PERSON_NAME_NOT_VALID);
	}

	default PersonValidation isSurnameValid() {
		return and(p -> p.getSurname() != null && p.getSurname().length() > 1 ? ValidationResult.SUCCESS : ValidationResult.PERSON_SURNAME_NOT_VALID);
	}

	default PersonValidation isAgeValid() {
		return and(p -> p.getAge() > 17 ? ValidationResult.SUCCESS : ValidationResult.PERSON_AGE_NOT_VALID);
	}

	private PersonValidation and(PersonValidation other) {
		return person -> {
			ValidationResult result = this.apply(person);
			return result.equals(ValidationResult.SUCCESS) ? other.apply(person) : result;
		};
	}

}
