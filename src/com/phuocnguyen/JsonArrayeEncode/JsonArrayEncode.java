package com.phuocnguyen.JsonArrayeEncode;

import java.io.Serializable;

import org.json.simple.JSONArray;

public class JsonArrayEncode implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void jsonArrayEncode() {

		JSONArray jsonArray = new JSONArray();
		/*
		 * added items into JSON data
		 */
		jsonArray.add("phuocnguyen");
		jsonArray.add(new Integer(23));
		jsonArray.add(new Double(1.65));
		jsonArray.add(new Integer(2019));

		/*
		 * print out
		 */
		System.out.println(jsonArray);
	}
}
