package com.rvcode.demos.jaxb.recursive_objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class StringAdapter extends XmlAdapter<StringAdapter.StringWrapper, String> {
	public static class StringWrapper{
		@XmlAttribute
		String value;
	}

	@Override
	public StringWrapper marshal(String v) throws Exception {
		StringWrapper w = new StringWrapper();
		w.value = v;
		return w;
	}

	@Override
	public String unmarshal(StringWrapper v) throws Exception {
		return v.value;
	}
}