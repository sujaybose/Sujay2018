package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RegTest2 {
	@Test
	public void f() {
		System.out.println("This is test Method2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method2");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class2");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class2");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before Test2");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test2");
	}

}
