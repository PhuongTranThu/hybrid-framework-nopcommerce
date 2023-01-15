package javaOOP.overloading;

import javaOOP.Topic_06_Getter_Setter;

public class Testing {

	public static void main(String[] args) {
		Topic_06_Getter_Setter topic = new Topic_06_Getter_Setter();
		topic.personName = "Automation";
		topic.personAge = -10;
		topic.personPhone = 98765;

		topic.setPersonName("Automation");
		System.out.println(topic.getPersonName());

		topic.setPersonName("");
		System.out.println(topic.getPersonName());

	}

}
