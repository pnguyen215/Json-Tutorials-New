package com.phuocnguyen.EncodeJSONArray;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class EncodeJSONArray implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void encodeJSONArray() {
		/*
		 * Encode a JSON Array - to String
		 */
		JSONArray jsonArray = new JSONArray();
		String jsonOutput;
		/*
		 * insert data into JSON data
		 */
		jsonArray.add("phuocnguyen");
		jsonArray.add(new Integer(23));
		jsonArray.add(new Double(1.65));
		jsonArray.add(new Integer(2019));
		jsonArray.add(null);
		/*
		 * convert to form JSON DATA
		 */
		jsonOutput = jsonArray.toString();
		System.out.println("Encode a JSON Array - to String");
		System.out.println(jsonOutput);

		/*
		 * Encode a JSON Array - Streaming
		 */
		System.out.println("Encode a JSON Array - Streaming");
		StringWriter stringWriter = new StringWriter();
		try {
			jsonArray.writeJSONString(stringWriter);
			jsonOutput = jsonArray.toString();
			System.out.println(jsonOutput);
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}

		/*
		 * Encode a JSON Array - Using List
		 */
		System.out.println("Encode a JSON Array - Using List");
		@SuppressWarnings("rawtypes")
		List list = new LinkedList();
		/*
		 * insert data into JSON data
		 */
		list.add("phuocnguyen");
		list.add(new Integer(23));
		list.add(new Double(1.65));
		list.add(new Integer(2019));
		list.add(null);
		/*
		 * convert to form JSON data
		 */
		jsonOutput = JSONValue.toJSONString(list);
		/*
		 * print out
		 */
		System.out.println(jsonOutput);

		/*
		 * Encode a JSON Array - Using List and Stream
		 */
		System.out.println("Encode a JSON Array - Using List and Stream");
		stringWriter = new StringWriter();
		try {
			JSONValue.writeJSONString(list, stringWriter);
			/*
			 * convert to form JSON data
			 */
			jsonOutput = stringWriter.toString();
			/*
			 * print out
			 */
			System.out.println(jsonOutput);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
