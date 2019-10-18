package com.phuocnguyen.DecodeJsonContentHandler;

import java.io.IOException;
import java.io.Serializable;

import org.json.simple.parser.ContentHandler;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MyContentHandler implements Serializable {

	private static final long serialVersionUID = 1L;

	public void contentHandler() {
		/*
		 * declared JSONParser
		 */
		JSONParser jsonParser = new JSONParser();
		/*
		 * string JSON text
		 */
		String jsonText = "{\"name\": \"phuocnguyen\", \"age\":23, \"major\": \"SE\", \"year\": 2019}";

		try {
			CustomContentHandler customContentHandler = new CustomContentHandler();
			jsonParser.parse(jsonText, customContentHandler, true);
		} catch (ParseException e) {
			System.out.println("Position: " + e.getPosition());
			System.out.println(e);
		}
	}
}

class CustomContentHandler implements ContentHandler {

	@Override
	public boolean endArray() throws ParseException, IOException {
		System.out.println("endArray");
		return true;
	}

	@Override
	public void endJSON() throws ParseException, IOException {
		System.out.println("endJSON");
	}

	@Override
	public boolean endObject() throws ParseException, IOException {
		System.out.println("endObject");
		return true;
	}

	@Override
	public boolean endObjectEntry() throws ParseException, IOException {
		System.out.println("endObjectEntry");
		return true;
	}

	@Override
	public boolean primitive(Object arg0) throws ParseException, IOException {
		System.out.println("primitive: " + arg0);
		return true;
	}

	@Override
	public boolean startArray() throws ParseException, IOException {
		System.out.println("startArray");
		return true;
	}

	@Override
	public void startJSON() throws ParseException, IOException {
		System.out.println("startJSON");
	}

	@Override
	public boolean startObject() throws ParseException, IOException {
		System.out.println("startObject");
		return true;
	}

	@Override
	public boolean startObjectEntry(String arg0) throws ParseException, IOException {
		System.out.println("startObjectEntry: " + arg0);
		return true;
	}

}
