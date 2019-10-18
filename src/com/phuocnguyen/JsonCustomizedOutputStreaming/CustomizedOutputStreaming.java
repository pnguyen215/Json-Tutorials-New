package com.phuocnguyen.JsonCustomizedOutputStreaming;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;

import org.json.simple.JSONArray;

import com.phuocnguyen.JsonCustomizedOutput.Person;

public class CustomizedOutputStreaming implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void myCustomizedOutputStreaming() {
		/*
		 *
		 */
		JSONArray jsonArray = new JSONArray();
		/*
		 * create a lot of person objects
		 */
		Person person1 = new Person(1, "phuocnguyen");
		Person person2 = new Person(2, "phuocnguyen");
		Person person3 = new Person(1, "phuocnguyen");
		/*
		 * compare each together
		 */
		if (person1.equals(person2) && person1.equals(person3)) {
			jsonArray.add(person1);
			System.out.println("case 1");
		} else if (person2.equals(person3) && !person1.equals(person3)) {
			jsonArray.add(person2);
			jsonArray.add(person1);
			System.out.println("case 2");
		} else if (person1.equals(person2) && (!person1.equals(person3) || !person2.equals(person3))) {
			jsonArray.add(person1);
			jsonArray.add(person3);
			System.out.println("case 3");
		} else if (person1.equals(person3) && (!person1.equals(person2) || !person2.equals(person3))) {
			jsonArray.add(person3);
			jsonArray.add(person2);
			System.out.println("case 4");
		} else {
			jsonArray.add(person1);
			jsonArray.add(person2);
			jsonArray.add(person3);
			System.out.println("case 5");
		}

		/*
		 * print out
		 */
		StringWriter stringWriter = new StringWriter();
		try {
			jsonArray.writeJSONString(stringWriter);
			/*
			 * result
			 */
			System.out.println(stringWriter.toString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
