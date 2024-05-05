package com.chivalrous.example;

import java.util.Random;
import java.util.function.Supplier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SupplierExample {

	private static final Supplier<Person> createPerson = Person::new;

	private static final Supplier<Integer> generateNewAge = Person::getRandomAge;

	public static void main(String[] args) {
		log.info("Created: " + createPerson.get().toString());
		log.info("Created: " + new Person("new-name", "new-surname", generateNewAge.get()));
	}

	@Getter
	@AllArgsConstructor
	private static class Person {

		private static Random random = new Random();

		private String name;
		private String surname;
		private int age;

		public Person() {
			name = "default-name";
			surname = "default-surname";
			age = 25;
		}

		public static int getRandomAge() {
			return random.nextInt(70) + 1;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", surname=" + surname + ", age=" + age + "]";
		}

	}

}