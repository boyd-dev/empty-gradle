package com.foo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.foo.example.HelloWorld;

class MyTest {

	@Test
	@DisplayName("HelloWorld Test")
	void test() {
		
		HelloWorld hw = new HelloWorld();
        String result = hw.hello();
        
        assertTrue(result.startsWith("Hello, World!"));
        
        String dateTimePart = result.substring(14);
        System.out.println(dateTimePart);

	}
	
}
