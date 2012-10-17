package com.rvcode.demos.jaxb.recursive_objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class IntegerAdapter extends XmlAdapter<IntegerAdapter.IntegerWrapper, Integer> {
	public static class IntegerWrapper{
		@XmlAttribute
		Integer value;
	}

	@Override
	public IntegerWrapper marshal(Integer v) throws Exception {
		IntegerWrapper w = new IntegerWrapper();
		w.value = v;
		return w;
	}

	@Override
	public Integer unmarshal(IntegerWrapper v) throws Exception {
		return v.value;
	}
}