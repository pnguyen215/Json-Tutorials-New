package com.phuocnguyen.CombinationPrimitiveObjectMapList;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class MyCombination implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void myCombination() {

		/*
		 *
		 */
		JSONObject jsonObject = new JSONObject();
		/*
		 *
		 */
		@SuppressWarnings("rawtypes")
		Map map = new LinkedHashMap();
		map.put("name", "phuocnguyen");
		map.put("location", "HCM");
		/*
		 *
		 */
		@SuppressWarnings("rawtypes")
		List list = new LinkedList();
		list.add(new Integer(2019));

		/*
		 * step combine
		 */
		jsonObject.put("map", map);
		jsonObject.put("list", list);
		/*
		 *
		 */
		String jsonOutput = JSONValue.toJSONString(jsonObject);
		System.out.println(jsonOutput);

	}
}
