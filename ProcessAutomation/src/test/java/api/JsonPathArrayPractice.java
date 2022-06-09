package api;

import io.restassured.path.json.JsonPath;

public class JsonPathArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String payLoad = "[\r\n" + 
				"  {\r\n" + 
				"    \"firstName\" : \"Rakesh\",\r\n" + 
				"    \"lastName\" : \"Nadia\",\r\n" + 
				"    \"address\" :[\r\n" + 
				"      {\r\n" + 
				"        \"city\" : \"Bengaluru\",\r\n" + 
				"        \"country\" : \"India\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"city\" : \"Manchester\",\r\n" + 
				"        \"country\" : \"United Kingdom\"\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    \"age\" : 29,\r\n" + 
				"    \"married\" : true\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"firstName\" : \"Sarang\",\r\n" + 
				"    \"lastName\" : \"Kharat\",\r\n" + 
				"    \"address\" : [\r\n" + 
				"      {\r\n" + 
				"        \"city\" : \"Pune\",\r\n" + 
				"        \"country\" : \"India\"\r\n" + 
				"      }  \r\n" + 
				"    ],\r\n" + 
				"    \"age\" : 33,\r\n" + 
				"    \"married\" : true\r\n" + 
				"  }\r\n" + 
				"]";
		JsonPath payloadPath = new JsonPath(payLoad);
		
	}

}
