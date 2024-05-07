package JavatoXml_Marshalling;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

public class JavaToXml3Schema {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student();
		s1.setId(1); // Set id first
		s1.setFirstName("Aman");
		s1.setLastName("Kumar");
		// s1.setId(1);

		// Create JAXB context
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);

		// Create marshaller
		Marshaller marshaller = jaxbContext.createMarshaller();

		// Set output format
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		// Create schema
		SchemaFactory sf = SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = sf.newSchema(
				new File("C:\\Users\\User\\eclipse-workspace\\studywithme\\src\\JavatoXml_Marshalling\\student.xsd")); // assuming
																														// you
																														// saved
																														// the
																														// XSD
																														// as
																														// student.xsd

		// Set schema for validation
		marshaller.setSchema(schema);

		// Create file
		File file = new File(
				"C:\\Users\\User\\eclipse-workspace\\studywithme\\src\\JavatoXml_Marshalling\\student1.xml");

		// Marshal and validate
		marshaller.marshal(s1, file);
		System.out.println("Validated");
	}
}
