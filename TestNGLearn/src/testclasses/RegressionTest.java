package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RegressionTest {
	@Test
	public void f() {
		System.out.println("This is test Method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test");
	}

}
