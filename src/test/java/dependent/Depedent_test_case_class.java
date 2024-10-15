package dependent;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depedent_test_case_class {

	@Test 
	public void verifyUserCanLoginWithValidusernameandPassward() {
		System.out.println("Verify user can login with valid user id & passward");
		Assert.assertTrue(true);
	}

@Test (dependsOnMethods = {"verifyUserCanLoginWithValidusernameandPassward"})
public void VerifyUserCanSendEmail() {
	System.out.println("Verify user can send email");
	Assert.assertTrue(false);

}

@Test (dependsOnMethods = {"VerifyUserCanSendEmail"})
public void VerifyUserCanReadEmail() {
	System.out.println("Verify user can Read email");
}
}
