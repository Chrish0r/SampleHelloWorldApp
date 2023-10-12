package greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ParserJson {

	private final static Logger logger = LoggerFactory.getLogger(ParserJson.class);

	public static void main(String[] args) {
		logger.error("Anwendung startet...");

//		logger.info("Name: {}",getNameFromJson("{\"name\": \"hendrik\"}"));
//		logger.info("Name: {}", getNameFromJson(null));

//		System.out.println(getNameFromJson("{\"name\": \"hendrik\"}"));
//		System.out.println(getNameFromJson("BAD"));
		System.out.println(getNameFromJson("{\"username\": \"hendrik\"}"));
	}

	public static String getNameFromJson(String input) {
		if (input == null) {
			throw new NullPointerException("Input must not be null");
		}
		
		

		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(input);
		logger.info("JSON erfolgreich geparst...");
		JsonObject object = element.getAsJsonObject();
		String name = object.get("name").getAsString();

		return name;
	}

}
