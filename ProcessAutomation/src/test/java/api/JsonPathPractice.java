package api;

import io.restassured.path.json.JsonPath;

public class JsonPathPractice {

	public static void main(String[] args) {

			
		String payload = "{\r\n" + 
				"  \"firstName\": \"Bobby\",\r\n" + 
				"  \"lastName\": \"Singer\",\r\n" + 
				"  \"age\" : 39,\r\n" + 
				"  \"address\" : {\r\n" + 
				"    \"flatNo\" : 401,\r\n" + 
				"    \"buildingName\" : \"Warzaw Apartments\",\r\n" + 
				"    \"streetName\" : {\r\n" + 
				"        \"street1\" : \"Bakers Street 232\"\r\n" + 
				"    },\r\n" + 
				"    \"pincode\" : 384932\r\n" + 
				"  },\r\n" + 
				"  \"salary\" : 35000,\r\n" + 
				"  \"married\" : false\r\n" + 
				"}";
		
		JsonPath jsonPath = new JsonPath(payload);
		System.out.println(jsonPath.getString("firstName"));
		System.out.println(jsonPath.getInt("age"));
		System.out.println(jsonPath.get("address.flatNo").toString());
		System.out.println(jsonPath.getString("address.streetName.street1"));
		Object addressJson = jsonPath.get("address");

		
		
		
	}

}
