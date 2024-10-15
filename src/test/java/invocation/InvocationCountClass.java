package invocation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountClass {

	@Test (invocationCount = 4)
	public void VerifyUserCanSendEmail() {
		System.out.println("Verify user can send email");
		Assert.assertTrue(true);

	}
}
