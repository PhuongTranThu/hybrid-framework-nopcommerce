package javaOOP;

import lombok.Getter;
import lombok.Setter;

public class Topic_06_Getter_Setter {
	@Getter
	@Setter
	public String personName;
	public int personAge;
	public int personPhone;

//	public void setPersonName(String personName) {
//		if (personName == null || personName.isEmpty() || personName.isBlank()) {
//			throw new IllegalArgumentException("Name is invalid");
//		} else {
//			this.personName = personName;
//		}
//	}

	public String getPersonName() {
		return this.personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		if (personAge > 15 && personAge < 60) {
			throw new IllegalArgumentException("Age is invalid");
		} else {
			this.personAge = personAge;
		}
	}

	public int getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(int personPhone) {
		if (!String.valueOf(personPhone).startsWith("0")) {
			throw new IllegalArgumentException("The phone number must start: 09 - 03 - 012 - 016 - 019");
		} else if (personPhone < 10 || personPhone > 11) {
			throw new IllegalArgumentException("Phone number must be 10-11 numbers");
		} else {
			this.personPhone = personPhone;
		}
	}

	public void showPersonInfo() {
		System.out.println(this.personName);
		System.out.println(this.personAge);
		System.out.println(this.personPhone);

	}

}
