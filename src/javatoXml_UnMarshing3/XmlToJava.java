package javatoXml_UnMarshing3;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 * What if there is a mismatch in XML File firstName --> FIRSTNAME (n is the
 * Mismatch)
 * https://www.youtube.com/watch?v=8Gpdnbp_dJA&t=6s&ab_channel=Infybuzz
 */
public class XmlToJava {
	public static void main(String[] args) {
		try {
			String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><student><FIRSTNAME>AmanWhyyyy</FIRSTNAME><id>11111</id><lastName>KumarKumar</lastName></student>";
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
