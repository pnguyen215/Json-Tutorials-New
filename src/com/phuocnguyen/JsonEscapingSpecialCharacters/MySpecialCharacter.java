package com.phuocnguyen.JsonEscapingSpecialCharacters;

import java.io.Serializable;

import org.json.simple.JSONObject;

public class MySpecialCharacter implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("static-access")
	public void mySpecialCharacters() {

		String specialString = "text special character is /\"\'\b\f\t\r\n.";

		JSONObject jsonObject = new JSONObject();
		/*
		 * before escaping
		 */
		System.out.println(specialString);
		/*
		 * after escaping
		 */
		specialString = jsonObject.escape(specialString);
		System.out.println(specialString);
	}
}
