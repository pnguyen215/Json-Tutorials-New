package com.phuocnguyen.JsonCustomizedOutput;

import java.io.Serializable;

import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

public class Person implements Serializable, JSONAware {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;

	public Person() {

	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person eq = (Person) obj;
			if (eq.getId() == this.id && eq.getName().equals(this.name)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public String toJSONString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append("name");
		builder.append(":");
		builder.append("\"" + JSONObject.escape(name) + "\"");
		builder.append(",");
		builder.append("id");
		builder.append(":");
		builder.append(id);
		builder.append("}");
		return builder.toString();
	}

}
