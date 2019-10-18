package com.phuocnguyen.DecodeJsonExceptionHandling;

import java.io.Serializable;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MyExceptionHandling implements Serializable {

	private static final long serialVersionUID = 1L;

	public void myExceptionHandling() {
		JSONParser jsonParser = new JSONParser();

		String jsonText = "[[null, 123.45, \"a\tb c\"]}, true";

		try {
			Object object = jsonParser.parse(jsonText);
			System.out.println(object);
		} catch (ParseException e) {
			System.out.println("Position: " + e.getPosition());
			System.out.println(e);
		}

	}
}
