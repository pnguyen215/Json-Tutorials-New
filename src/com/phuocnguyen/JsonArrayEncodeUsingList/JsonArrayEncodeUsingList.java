package com.phuocnguyen.JsonArrayEncodeUsingList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONValue;

public class JsonArrayEncodeUsingList implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void jsonArrayEncodeUsingList() {

		/*
		 * declared ArrayList
		 */
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();

		/*
		 * added items into JSON data
		 */
		list.add("phuocnguyen");
		list.add(new Integer(23));
		list.add(new Double(1.65));
		list.add(new Integer(2019));

		/*
		 * print out
		 */
		String jsonText = JSONValue.toJSONString(list);
		System.out.println(jsonText);
	}
}
