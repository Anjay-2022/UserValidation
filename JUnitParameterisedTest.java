package userValidation;


import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnitParameterisedTest {

	@Parameters
	public static Collection<String> validMail() {
		return Arrays.asList(new String[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" });
	}

	UserValidation user;
	String mail;

	public JUnitParameterisedTest(String mail) {
		this.user = new UserValidation();
		this.mail = mail;
	}

	@Test
	public void givenDifferentMails_WhenTrue_ShouldReturnHappy() {
		boolean result = user.checkemail(mail);
		assertTrue("happy", result);
	}

}
