package parser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import greeting.ParserJson;

public class ParserJsonTest {

	@Test
	void test() {
		// given
		String input = "{\"name\": \"hendrik\"}";

		// when
		String output = ParserJson.getNameFromJson(input);

		// then
		Assertions.assertEquals("hendrik", output);
	}

	@Test
	void testBadInput() {
		// given
		String input = "BAD"; // no json format

		// then
		final IllegalStateException exception = Assertions.assertThrows(IllegalStateException.class,
				() -> ParserJson.getNameFromJson(input));
		Assertions.assertEquals("Not a JSON Object: \"BAD\"" , exception.getMessage());
	}
	
	@Test
	void testNoNameInput() {
		// TODO
	}


	@Test
	void testNullInput() {
		// given
		String input = null;

		// then
		final NullPointerException exception = Assertions.assertThrows(NullPointerException.class,
				() -> ParserJson.getNameFromJson(null));
		Assertions.assertEquals("Input must not be null", exception.getMessage());

	}
	
}
