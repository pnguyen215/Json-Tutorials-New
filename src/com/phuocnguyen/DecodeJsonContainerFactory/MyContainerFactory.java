package com.phuocnguyen.DecodeJsonContainerFactory;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ContainerFactory;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MyContainerFactory implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void containerFactory() {

		/*
		 * declared JSONParser
		 */
		JSONParser jsonParser = new JSONParser();
		String jsonText = "{\"name\": \"phuocnguyen\", \"age\":23, \"major\":\"SE\"}"; /*
																						 * JSON data is object type data
																						 */

		/*
		 * declared Container Factory
		 */
		ContainerFactory containerFactory = new ContainerFactory() {

			@SuppressWarnings("rawtypes")
			@Override
			public Map createObjectContainer() {
				return new LinkedHashMap<>(); // if JSON data is Object then return a new Map to save all it
			}

			@SuppressWarnings("rawtypes")
			@Override
			public List creatArrayContainer() {
				return new LinkedList<>(); // if JSON data is Array then return a new List to save all it
			}
		};
		try {
			@SuppressWarnings("rawtypes")
			Map map = (Map) jsonParser.parse(jsonText, containerFactory);
			/*
			 * using for each loop to list elements from JSON data
			 */
			map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
		} catch (ParseException e) {
			System.out.println("Position: " + e.getPosition());
			System.out.println(e);
		}
	}
}
