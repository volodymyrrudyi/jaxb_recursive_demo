package com.rvcode.demos.jaxb.recursive_objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class FloatAdapter extends XmlAdapter<FloatAdapter.FloatWrapper, Float> {
	public static class FloatWrapper{
		@XmlAttribute
		Float value;
	}

	@Override
	public FloatWrapper marshal(Float v) throws Exception {
		FloatWrapper w = new FloatWrapper();
		w.value = v;
		return w;
	}

	@Override
	public Float unmarshal(FloatWrapper v) throws Exception {
		return v.value;
	}
}
