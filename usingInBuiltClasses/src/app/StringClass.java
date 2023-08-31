package app;

import java.nio.charset.Charset;

public class StringClass {
	//string constructor
	public StringClass() {

		System.out.println("Calling No-argument Constructor....");
	}

	public StringClass(byte[] bytes, Charset charset) {
		System.out.println("Calling 2 paramerteized Constructor....");

	}

	public StringClass(char[] value) {
		System.out.println("Calling 1 paramerteized Constructor....");

	}
	
	

}
