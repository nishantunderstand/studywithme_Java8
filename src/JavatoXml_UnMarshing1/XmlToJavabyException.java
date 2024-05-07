package JavatoXml_UnMarshing1;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import javatoXml_UnMarshing2.Student;

/**
 * // String relativePath = "src\JavatoXml_UnMarshing1\student.xml"; // Wrong if
 * i add different, will it read or not ? Answer NO You can to String to fetch
 * the Data Or setter Method. Your choice.
 */
public class XmlToJavabyException {
	public static void main(String[] args) throws Exception {
		// File file = new
		// File("C:\\Users\\User\\eclipse-workspace\\studywithme\\src\\_JavatoXml_UnMarshing\\student.xml");

		String relativePath = "src/JavatoXml_UnMarshing1/student.xml";
		File file = new File(relativePath);
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Student s2 = (Student) unmarshaller.unmarshal(file);
		/*
		 * System.out.println(s2.getFirstName()); System.out.println(s2.getLastName());
		 * System.out.println(s2.getId());
		 * 
		 * s2.getFirstName(); s2.getLastName(); s2.getId(); s2.toString();
		 */
		System.out.println("Hii");
		System.out.println(s2.toString());
	}

}
