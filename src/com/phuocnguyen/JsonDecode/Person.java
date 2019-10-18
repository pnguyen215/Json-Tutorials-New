package com.phuocnguyen.JsonDecode;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private long age;
	private String major;

	public Person() {

	}

	public Person(String name, long age, String major) {
		super();
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", major=" + major + "]";
	}

}
