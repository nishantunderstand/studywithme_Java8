
package json_jackson;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
	public static void main(String[] args) throws JAXBException, IOException {
		String relPath = "src/main/java/json_jackson/address.json";
		File file = new File(relPath);
		System.out.println("Okay1");
		ObjectMapper objectMapper = new ObjectMapper();
		Address ad = objectMapper.readValue(file, Address.class); 
		System.out.println(ad.toString());

	}
}
