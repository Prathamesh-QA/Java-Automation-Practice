package api;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathFilter1 {

	public static void main(String[] args) {
		
		String filePath = System.getProperty("user.dir") + "/src/test/resources/testdata/Employee-Details.json";
		File payload =  new File(filePath);
		
		JsonPath jsonPath = new JsonPath(payload);
		List<Object> dataSet = jsonPath.getList("$");
		//traversing to entire json response
		for(Object data : dataSet) {
			System.out.println(data);
		}
		//getting list of element from the json array
		List<String> firstNames = jsonPath.getList("firstName");
		firstNames.forEach(name -> System.out.print(name + " "));
		

	}

}
