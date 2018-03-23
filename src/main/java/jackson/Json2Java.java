package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json2Java {

	public static void main(String[] args) {
		ObjectMapper mapper=new ObjectMapper();
		try {
			User user=new User();
			user.setUsename("yzc");
			user.setPassword("666");
			System.out.println(mapper.writeValueAsString(user));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
