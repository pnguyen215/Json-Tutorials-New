package com.phuocnguyen.EncodeJSONObject;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class EncodeJSONObject implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void encodeJSONObject() {

		JSONObject jsonObject = new JSONObject();

		String jsonOutput;

		/*
		 * insert data into JSON data
		 */
		jsonObject.put("name", "phuocnguyen");
		jsonObject.put("age", new Integer(23));
		jsonObject.put("major", "SE");
		jsonObject.put("point", new Double(9.6));
		/*
		 * Encode a JSON Object - to String
		 */
		/*
		 * convert JSON type data
		 */
		jsonOutput = jsonObject.toString(); /* Encode a JSON Object - to String */
		System.out.println("Encode a JSON Object - to String");
		System.out.println(jsonOutput);
		/*
		 * Encode a JSON Object - Streaming
		 */
		System.out.println("Encode a JSON Object - Streaming");
		StringWriter stringWriter = new StringWriter();
		try {
			jsonObject.writeJSONString(stringWriter); /* Encode a JSON Object - Streaming */
			jsonOutput = stringWriter.toString();
			System.out.println(jsonOutput);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		/*
		 * Encode a JSON Object - Preserving Order
		 */
		System.out.println("Encode a JSON Object - Preserving Order");
		@SuppressWarnings("rawtypes")
		Map map = new LinkedHashMap();
		/*
		 * insert data into new JSON data
		 */
		map.put("name", "phuocnguyen");
		map.put("age", new Integer(23));
		map.put("major", "SE");
		map.put("point", new Double(9.6));
		/*
		 *
		 */
		jsonOutput = JSONValue.toJSONString(map);
		/*
		 * print out
		 */
		System.out.println(jsonOutput);

		/*
		 * Encode a JSON Object - Preserving Order and Stream
		 */
		System.out.println("Encode a JSON Object - Preserving Order and Stream");
		stringWriter = new StringWriter();
		try {
			JSONValue.writeJSONString(map, stringWriter);
			jsonOutput = stringWriter.toString();
			//
			System.out.println(jsonOutput);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
