package com.phuocnguyen.JsonMergingObjects;

import java.io.Serializable;

import org.json.simple.JSONObject;

public class MergingObjects implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void mergingObjects() {
		JSONObject jsonObject_1 = new JSONObject();
		jsonObject_1.put("name", "phuocnguyen");
		jsonObject_1.put("age", new Integer(23));

		JSONObject jsonObject_2 = new JSONObject();
		jsonObject_2.put("year", new Integer(2019));
		jsonObject_2.put("point", new Double(9.6));

		/*
		 *
		 * MergingObjects
		 */
		jsonObject_1.putAll(jsonObject_2);

		/*
		 * print out
		 */
		System.out.println(jsonObject_1);
	}
}
