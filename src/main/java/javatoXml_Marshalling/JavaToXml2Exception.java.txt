package JavatoXml_Marshalling;
/**
 * https://www.youtube.com/watch?v=iyPd7OZ6qXw&ab_channel=Infybuzz
 * you can use try block as well.
 */

// Can you find to grammar / Schema ?

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXml2Exception {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		s1.setId(1);
		s1.setFirstName("Aman");
		s1.setLastName("Kumar");

		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		File file = new File(
				"C:\\Users\\User\\eclipse-workspace\\studywithme\\src\\JavatoXml_Marshalling\\student.xml");
		marshaller.marshal(s1, file);
		System.out.println("XML Generated");

	}

}
