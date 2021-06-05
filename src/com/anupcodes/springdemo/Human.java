package com.anupcodes.springdemo;

import java.util.Comparator;

public class Human implements Comparable<Human>{
	
//public class Human implements Comparator<Human>{	

	@Override
	public String toString() {
		return "Human [name=" + name + ", middleName=" + middleName + ", surName=" + surName + ", age=" + age + "]";
	}

	private String name;
	private String middleName;
	private String surName;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}


	public int compareTo(Human arg0) {
		
		return this.age = arg0.age;
	}
	
	public static Comparator<Human> NameComparator = new Comparator<Human>() {
		@Override
		public int compare(Human arg0, Human arg1) {
			
			return arg0.getName().compareTo(arg1.getName());
		}
	};

	
}
