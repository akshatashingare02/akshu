package dependent;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depedent_test_case_class2 {

	@Test 
	public void verifyUserCanLoginWithValidusernameandPassward() {
		System.out.println("Verify user can login with valid user id & passward");
		Assert.assertTrue(false);
	}

@Test (dependsOnMethods = {"verifyUserCanLoginWithValidusernameandPassward"})
public void VerifyUserCanSendEmail() {
	System.out.println("Verify user can send email");
	Assert.assertTrue(true);

}

@Test (dependsOnMethods = {"VerifyUserCanSendEmail","verifyUserCanLoginWithValidusernameandPassward"})
public void VerifyUserCanReadEmail() {
	System.out.println("Verify user can Read email");
}
}
