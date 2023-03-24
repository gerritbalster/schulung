package de.atruvia.first;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Demo {

	public void printMsg() {
		System.out.println("Demo1");
	}
	
//	public Demo() {
//		System.out.println("Test");
//	}
}
