package api;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonArrayExample1 {

	public static void main(String[] args) {
		
		String payload = "[\r\n" + 
				"  10,\r\n" + 
				"  20,\r\n" + 
				"  30,\r\n" + 
				"  40,\r\n" + 
				"  50\r\n" + 
				"]";
		
		JsonPath jsonPath = new JsonPath(payload);
		//get the element from array using indexing 
		System.out.println(jsonPath.getString("[1]"));
		//get the entire list of elements from json array
		List<String> ageList = jsonPath.getList("$");
		System.out.println(ageList);
		//get the size of the list of the json array
		System.out.println(jsonPath.getList("$").size());

	}

}
