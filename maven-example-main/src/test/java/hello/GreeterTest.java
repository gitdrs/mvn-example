package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class GreeterTest {
	
	private Greeter greeter = new Greeter();


	@Test
	public void greeterSaysHello() {

		assertThat(greeter.sayHello(), containsString("Hello"));
	}

	
	@Test
	public void testsayHellomethod(){

		assertEquals("Hello world!",greeter.sayHello());

	}

	@Test
	public void testMultiplicationby2_successScenario(){

		int actualVal=greeter.multipliedBytwoResult(4);
		int expectedVal=8;
		assertEquals(expectedVal,actualVal);

	}

	@Test
	public void testMultiplicationby2_fail_scenario(){

		int actualVal=greeter.multipliedBytwoResult(4);
		int expectedVal=0;
		assertNotEquals(expectedVal,actualVal);

	}



	@Test
	public void testFullnameMethod_success_scenario() throws Exception {

		String fullNameActual=greeter.fullName("firstName","lastName","midddleName");
		String expected="firstName midddleName lastName";
		assertEquals(expected,fullNameActual);
	}

	@Test
	public void testFullnameMethod_failure_scenario() throws Exception {

		String fullNameActual=greeter.fullName("firstName","lastName","midddleName");
		String expected="jntu";
		assertNotEquals(expected,fullNameActual);
	}



}

