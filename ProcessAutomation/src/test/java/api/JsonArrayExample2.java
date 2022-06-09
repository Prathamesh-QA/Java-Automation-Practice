package api;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonArrayExample2 {

	public static void main(String[] args) {
		
		// this is array of array json
		String payload = "[\r\n" + 
				"  [\r\n" + 
				"    10,\r\n" + 
				"    20,\r\n" + 
				"    30,\r\n" + 
				"    40,\r\n" + 
				"    50\r\n" + 
				"  ],\r\n" + 
				"  [\r\n" + 
				"    100,\r\n" + 
				"    200,\r\n" + 
				"    300,\r\n" + 
				"    400,\r\n" + 
				"    500\r\n" + 
				"  ]\r\n" + 
				"]";
		
		JsonPath jsonPath = new JsonPath(payload);
		//get the element from array using indexing 
		System.out.println(jsonPath.getString("[1][3]"));
		//get the entire list of elements from json array
		List<String> ageList = (List<String>)jsonPath.getList("$").get(1);
		System.out.println(ageList);
		//get the size of the list of the json array
		System.out.println(ageList.size());

	}

}
