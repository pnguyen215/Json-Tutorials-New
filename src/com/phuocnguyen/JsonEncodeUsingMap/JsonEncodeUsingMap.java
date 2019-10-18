package com.phuocnguyen.JsonEncodeUsingMap;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

public class JsonEncodeUsingMap implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void jsonEncodeUsingMap() {

		@SuppressWarnings("rawtypes")
		Map map = new HashMap();
		/*
		 * added a lot of objects into JSON data
		 */
		map.put("name", "phuocnugyen");
		map.put("age", new Integer(23));
		map.put("major", "SE");

		/*
		 * convert to JSON type
		 */
		String jsonText = JSONValue.toJSONString(map);
		/*
		 * print out
		 */
		System.out.println(jsonText);
	}
}
