package com.rvcode.demos.jaxb.recursive_objects;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.rvcode.demos.jaxb.recursive_objects.FloatAdapter.FloatWrapper;
import com.rvcode.demos.jaxb.recursive_objects.IntegerAdapter.IntegerWrapper;
import com.rvcode.demos.jaxb.recursive_objects.StringAdapter.StringWrapper;

public class StructureAdapter extends XmlAdapter<StructureAdapter.StructureWrapper, List<Object>> {
	public static class StructureWrapper{
		@XmlElements(value = {
				@XmlElement(name = "integer", type = IntegerWrapper.class),
				@XmlElement(name = "float", type = FloatWrapper.class),
				@XmlElement(name = "string", type = StringWrapper.class),
				@XmlElement(name = "structure", type = StructureWrapper.class),
		})
		List<Object> fields;
	}

	@Override
	public StructureWrapper marshal(List<Object> v) throws Exception {
		StructureWrapper w = new StructureWrapper();
		w.fields = v;
		return w;
	}

	@Override
	public List<Object> unmarshal(StructureWrapper v) throws Exception {
		return v.fields;
	}
}
