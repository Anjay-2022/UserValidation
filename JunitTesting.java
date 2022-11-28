package userValidation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class JunitTesting {
	
	@Test
	public void happyCase() {
		User obj = new User();
		assertTrue("HAPPY", obj.checkFirstName("Anjay"));
		assertTrue("HAPPY", obj.checklastName("Singh"));
		assertTrue("HAPPY", obj.checkemail("anjay2013@gmail.com"));
		assertTrue("HAPPY", obj.checkpassword("Anjay@12"));
		assertTrue("HAPPY", obj.checkmobileno("+91 7053211617"));
	}

	@Test
	public void firstNameSadCase() {
		User obj = new User();
		assertFalse("SAD",obj.checkFirstName("anjay"));
	}
	
	@Test
	public void lastNameSadCase() {
		User obj = new User();
		assertFalse("SAD case", obj.checklastName("de"));
	}
	
	@Test
	public void emailSadCase() {
		User obj = new User();
		assertFalse("SAD", obj.checkemail("anjay@@gmail.com1"));
	}
	
	@Test
	public void passwordSadCase() {
		User obj = new User();
		assertFalse("SAD", obj.checkpassword("An@12"));
	}
	
	@Test
	public void mobileSadCase() {
		User obj = new User();
		assertFalse("SAD", obj.checkmobileno("+91 -7053211617"));
	}
}
