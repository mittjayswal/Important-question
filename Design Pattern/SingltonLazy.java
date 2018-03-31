package com.as.mitt.designpattern;

public class SingltonLazy {

	private static SingltonLazy s;
	
	private SingltonLazy() {

	}
	
	public static SingltonLazy getIntance() {
		if (s == null) {
			synchronized (SingltonLazy.class) {
				if (s ==null) {
					s = new SingltonLazy();
				}
			}
		}
		return s;
	}
	
}
