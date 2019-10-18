package com.phuocnguyen.JsonObjectEncode;

import org.json.simple.JSONObject;

public class JsonEncode {

	public JsonEncode() {

	}

	@SuppressWarnings("unchecked")
	public void jsonObjectEncode() {
		JSONObject jsonObject = new JSONObject();
		/*
		 * add objects to JSON data
		 */
		jsonObject.put("name", "phuocnguyen");
		jsonObject.put("age", new Integer(23));
		jsonObject.put("major", "SE");

		/*
		 * print out
		 */
		System.out.println(jsonObject);
	}
}
