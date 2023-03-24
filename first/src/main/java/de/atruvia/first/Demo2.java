package de.atruvia.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Demo2 implements CommandLineRunner, DemoInterface {
	
	@Autowired
	private Demo demo;
//	public Demo2() {
//		System.out.println("Test2");
//	}

	@Override
	public void run(String... args) throws Exception {

		demo.printMsg();
		System.out.println("run");
		
	}

	@Override
	public void printMsg() {
		// TODO Auto-generated method stub
		System.out.println("Demo2");
		
	}
}
