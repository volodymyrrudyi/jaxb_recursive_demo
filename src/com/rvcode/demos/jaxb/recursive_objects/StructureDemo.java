package com.rvcode.demos.jaxb.recursive_objects;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.helpers.DefaultValidationEventHandler;

public class StructureDemo {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Data.class);
		Unmarshaller u = context.createUnmarshaller();
		u.setEventHandler(new DefaultValidationEventHandler());
		File xml = new File("./src/Data.xml");
		Data d = (Data)u.unmarshal(xml);
		
		System.out.println(d.toString());
	}

}
