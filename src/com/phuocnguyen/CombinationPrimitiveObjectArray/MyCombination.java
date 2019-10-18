package com.phuocnguyen.CombinationPrimitiveObjectArray;

import java.io.Serializable;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class MyCombination implements Serializable {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public void myCombination() {

		/*
		 *
		 */
		JSONArray jsonArray = new JSONArray();

		jsonArray.add("phuocnguyen");
		jsonArray.add(new Integer(23));

		/*
		 *
		 */
		JSONArray jsonArray2 = new JSONArray();

		jsonArray2.add("HCM city");
		jsonArray2.add(new Integer(2019));

		/*
		 *
		 */
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "david");
		jsonObject.put("point", new Double(9.6));

		/*
		 * step combine
		 */
		jsonObject.put("list1", jsonArray);

		System.out.println(jsonObject);

		jsonObject.put("list2", jsonArray2);

		System.out.println(jsonObject);
	}
}
