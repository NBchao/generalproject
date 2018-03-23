package jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Java2Json {

	public static void main(String[] args) {
		ObjectMapper mapper=new ObjectMapper();
		String test="{\"usename\":\"yzc\",\"password\":\"666\"}";
		try {
			User user = mapper.readValue(test, User.class);
			System.out.println(user.getUsename());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
