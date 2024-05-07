package javatoXml_UnMarshing2;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XmlToJava {
	public static void main(String[] args) {
		try {
			// File file = new
			// File("C:\\Users\\User\\eclipse-workspace\\studywithme\\src\\_JavatoXml_UnMarshing\\student.xml");
			String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><student><firstName>AmanWhyyyy</firstName><id>11111</id><lastName>KumarKumar</lastName></student>";
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Student s2 = (Student) unmarshaller.unmarshal(new StringReader(xmlStr));
			System.out.println(s2.getFirstName());
			System.out.println(s2.getLastName());
			System.out.println(s2.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
