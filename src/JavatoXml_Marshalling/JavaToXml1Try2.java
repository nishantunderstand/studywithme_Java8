package JavatoXml_Marshalling;

import java.io.File;

//import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 * How to Generate XML is a systematic Order ? You have to
 * use @XmlType(propOrder = {"id", "firstName", "lastName"}) Absolute Address
 * --> Relative Address // File file = new
 * File("C:\\Users\\User\\eclipse-workspace\\studywithme\\src\\JavatoXml_Marshalling\\student.xml");
 * 
 * JAXB --need--> POJO & Annoation & Getter & Setter & JAXBContext & Marshaller
 * Object & FileOutputPath
 * 
 */
public class JavaToXml1Try2 {
	public static void main(String[] args) {
		try {
			Student s1 = new Student();
			s1.setLastName("Kumar");
			s1.setFirstName("Aman");
			s1.setId(1);

			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			String relativePath = "src/JavatoXml_Marshalling/student.xml";
			File file = new File(relativePath);

			marshaller.marshal(s1, file);
			System.out.println("XML Successfully Generated");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
