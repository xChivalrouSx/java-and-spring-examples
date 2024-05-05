package com.chivalrous.example;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsumerExample {

	private static final Consumer<Person> sayHiFromPerson = Person::sayHi;

	private static final Consumer<Person> sayGoodByeFromPerson = Person::sayGoodBye;

	private static final BiConsumer<Person, String> sayHiToPerson = Person::sayHi;

	public static void main(String[] args) {
		Person person = new Person("person-name", "person-surname");

		sayHiFromPerson.accept(person);
		sayHiToPerson.accept(person, "person-to-hi");

		sayHiFromPerson.andThen(sayGoodByeFromPerson).accept(person);
	}

	@Getter
	@AllArgsConstructor
	private static class Person {

		private String name;
		private String surname;

		public void sayHi() {
			log.info("{} {} is saying hello!..", this.name, this.surname);
		}

		public void sayHi(String to) {
			log.info("{} {} is saying hello to {}!..", this.name, this.surname, to);
		}

		public void sayGoodBye() {
			log.info("{} {} is saying good bye!..", this.name, this.surname);
		}
	}

}