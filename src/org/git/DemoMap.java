package org.git;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
	public void sample() {
		// TODO Auto-generated method stub
	Map<Integer,String> m = new LinkedHashMap<>();
	m.put(20, "Nokia");
	m.put(10, "Redmi");
	m.put(50, "Iphone");
	m.put(30, "Samsung");
	m.put(40, "Oppo");
	System.out.println(m);
	boolean containsKey = m.containsKey(100);
	System.out.println(containsKey);
	boolean containsValue = m.containsValue("Moto");
	System.out.println(containsValue);
	Set<Integer> keySet = m.keySet();
	System.out.println(keySet);
	for (Integer x : keySet) {
		System.out.println(x);
	}
	Collection<String> values = m.values();
	System.out.println(values);
	for (String y : values) {
		System.out.println(y);
	}
	}
	public static void main(String[] args) {
		DemoMap d = new DemoMap();
		d.sample();
	}
}
