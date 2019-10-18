package com.phuocnguyen.JsonDecode;

import java.io.Serializable;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecode implements Serializable {

	private static final long serialVersionUID = 1L;

	public void jsonDecode() {

		/*
		 * declared string JSON text
		 */
		String string = "{\"name\":\"phuocnguyen\", \"age\": 23, \"major\":\"SE\" }";

		/*
		 * convert to Object
		 */
		Object object = JSONValue.parse(string);

		/*
		 * convert to JSON data
		 */
		JSONObject jsonObject = (JSONObject) object;

		/*
		 * get each item
		 */
		String name = (String) jsonObject.get("name");
		// JSON always get long type data not integer
		long age = (Long) jsonObject.get("age");
		String major = (String) jsonObject.get("major");

		/*
		 * create new person object
		 */
		Person person = new Person(name, age, major);

		/*
		 * print out
		 */
		System.out.println(string);
		System.out.println(person.toString());
	}
}
