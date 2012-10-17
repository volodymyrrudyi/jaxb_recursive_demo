package com.rvcode.demos.jaxb.recursive_objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import com.rvcode.demos.jaxb.recursive_objects.FloatAdapter.FloatWrapper;
import com.rvcode.demos.jaxb.recursive_objects.IntegerAdapter.IntegerWrapper;
import com.rvcode.demos.jaxb.recursive_objects.StringAdapter.StringWrapper;
import com.rvcode.demos.jaxb.recursive_objects.StructureAdapter.StructureWrapper;

@XmlRootElement(name = "data")
public class Data {
	
	@XmlElements(value = {
			@XmlElement(name = "integer", type = IntegerWrapper.class),
			@XmlElement(name = "float", type = FloatWrapper.class),
			@XmlElement(name = "string", type = StringWrapper.class),
			@XmlElement(name = "structure", type = StructureWrapper.class),
	})
	Object value;
}
