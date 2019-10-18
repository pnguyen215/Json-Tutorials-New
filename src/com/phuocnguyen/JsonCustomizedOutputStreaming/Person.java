package com.phuocnguyen.JsonCustomizedOutputStreaming;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class Person implements Serializable, JSONStreamAware {

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

	@SuppressWarnings("unchecked")
	@Override
	public void writeJSONString(Writer output) throws IOException {
		@SuppressWarnings("rawtypes")
		Map map = new LinkedHashMap();
		map.put("name", name);
		map.put("id", new Integer(id));
		/*
		 * mapping items
		 */
		JSONValue.writeJSONString(map, output);
	}

}
