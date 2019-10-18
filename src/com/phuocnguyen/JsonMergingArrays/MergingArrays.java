package com.phuocnguyen.JsonMergingArrays;

import java.io.Serializable;

import org.json.simple.JSONArray;

public class MergingArrays implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void mergingArrays() {
		JSONArray jsonArray = new JSONArray();
		jsonArray.add("phuocnguyen");
		jsonArray.add(new Integer(23));

		JSONArray jsonArray2 = new JSONArray();
		jsonArray2.add(new Double(9.6));
		jsonArray2.add(new Integer(2019));
		jsonArray2.add(null);
		/*
		 * Merging Arrays
		 */
		jsonArray.addAll(jsonArray2);
		/*
		 * print out
		 */
		System.out.println(jsonArray);
	}
}
