package annotation;

import org.testng.TestNG; //: This imports the TestNG class from the TestNG framework.
import org.testng.annotations.Test; // This imports the @Test annotation from TestNG, which marks methods as test cases.

public class AnnotationInTestNGTwo extends TestNG {
	@Test
	public void sampleAMethodFromAnnotationInTestNGTwo() {
		System.out.println("sample AAAAA Method From AnnotationIn TestNG Two");
	}

	@Test
	public void sampleBMethodFromAnnotationInTestNGTwo() {
		System.out.println("sample BBBBB Method From AnnotationIn TestNG Two");
	}
}

//extends TestNG: This line means that the class AnnotationInTestNGTwo inherits from the TestNG class. 
//Inheriting from TestNG isn’t necessary unless you're planning to run tests programmatically from this class, but in this case,
//it seems redundant since the methods are just using the @Test annotation.
