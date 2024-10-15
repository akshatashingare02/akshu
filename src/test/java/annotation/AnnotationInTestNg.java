package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationInTestNg {
@Test
	public void verifyUserCanLoginWithValidusernameandPassward() {
		System.out.println("Verify user can login with valid user id & passward");
	}

@Test
public void VerifyUserCanSendEmail() {
	System.out.println("Verify user can send email");
}

@Test
public void VerifyUserCanReadEmail() {
	System.out.println("Verify user can Read email");
}

@BeforeMethod
public void samplebeforemethodAnnotation() {
	System.out.println("sample before method Annotation");
}

@AfterMethod
public void sampleaftermethodAnnotation() {
	System.out.println("sample after method Annotation");
}

@BeforeClass
public void samplebeforeclassAnnotation() {
	System.out.println("sample before class Annotation");
}

@AfterClass
public void sampleAfterclassAnnotation() {
	System.out.println("sample After class Annotation");
}

@BeforeTest
public void samplebeforeTestAnnotation() {
	System.out.println("sample before Test Annotation");
}

@AfterTest
public void sampleAfterTestAnnotation() {
	System.out.println("sample After Test Annotation");
}

}
