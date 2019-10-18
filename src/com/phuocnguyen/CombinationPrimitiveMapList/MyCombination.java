package com.phuocnguyen.CombinationPrimitiveMapList;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONValue;

public class MyCombination implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void myCombination() {
		/*
		 *
		 */
		@SuppressWarnings("rawtypes")
		Map map = new LinkedHashMap();

		map.put("name", "phuocnguyen");
		map.put("location", "HCM");
		map.put("relationship", "dating");

		/*
		 *
		 */
		@SuppressWarnings("rawtypes")
		List list = new LinkedList();
		list.add(map); // added map into list
		list.add(new Integer(2019));
		/*
		 *
		 */
		String jsonOutput = JSONValue.toJSONString(list);
		System.out.println(jsonOutput);
	}
}
