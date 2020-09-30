package com.userregnewconti;
import com.userregnew.UserRegTest;
import com.userregnew.UserTestException;

import org.junit.rules.ExpectedException;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class UserTest {
    @Test 
    public void givenFirstName_WhenProper_ReturnTrue() {
    	boolean result=false;
    	UserRegTest user = new UserRegTest();
    	try {
    		    ExpectedException exceptionRule = ExpectedException.none();
			    exceptionRule.expect(UserTestException.class);
                result = user.checkFname("Kirti");
            }catch(UserTestException e) {
            	e.printStackTrace();
            }
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenImProper_ReturnFalse() {
    	UserRegTest user = new UserRegTest();
    	boolean result=false;
    	try {
    			ExpectedException exceptionRule = ExpectedException.none();
    			exceptionRule.expect(UserTestException.class);
    			result = user.checkFname("kirti");
    		}catch(UserTestException e) {
    			e.printStackTrace();
    		}
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenLastName_WhenProper_ReturnTrue() {
    	UserRegTest user = new UserRegTest();
    	boolean result=false;
    	try {
    			ExpectedException exceptionRule = ExpectedException.none();
    			exceptionRule.expect(UserTestException.class);
    			result = user.checkLname("Kumar");
    		}catch(UserTestException e) {
    			e.printStackTrace();
    		}
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenImProper_ReturnFalse() {
    	UserRegTest user = new UserRegTest();
    	boolean result=false;
    	try {
    			ExpectedException exceptionRule = ExpectedException.none();
				exceptionRule.expect(UserTestException.class);
				result = user.checkLname("kumar");
			}catch(UserTestException e) {
    			e.printStackTrace();
    		}
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenEmail_WhenProper_ReturnTrue() {
    	UserRegTest user = new UserRegTest();
    	boolean result=false;
    	try {
    			ExpectedException exceptionRule = ExpectedException.none();
    			exceptionRule.expect(UserTestException.class);
    			result = user.checkEmail("krtkumar08@gmail.com");
    			}catch(UserTestException e) {
        			e.printStackTrace();
        		}
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WhenImProper_ReturnFalse() {
    	UserRegTest user = new UserRegTest();
    	boolean result=false;
    	try {
    			ExpectedException exceptionRule = ExpectedException.none();
    			exceptionRule.expect(UserTestException.class);
    			result = user.checkEmail("Krtkumar@08@gmail.com");
    			}catch(UserTestException e) {
        			e.printStackTrace();
        		}
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumb_WhenProper_ReturnTrue() {
    	UserRegTest user = new UserRegTest();
    	boolean result=false;
    	try {
    			ExpectedException exceptionRule = ExpectedException.none();
				exceptionRule.expect(UserTestException.class);
				result = user.checkPhoneNumber("91 8837898455");
				}catch(UserTestException e) {
        			e.printStackTrace();
        		}
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumb_WhenImProper_ReturnFalse() {
    	UserRegTest user = new UserRegTest();
    	boolean result=false;
    	try {
    			ExpectedException exceptionRule = ExpectedException.none();
				exceptionRule.expect(UserTestException.class);
				result = user.checkPhoneNumber("987456");
				}catch(UserTestException e) {
        			e.printStackTrace();
        		}
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPassword_WhenProper_ReturnTrue() {
    	UserRegTest user = new UserRegTest();
    	boolean result=false;
    	try {
    			ExpectedException exceptionRule = ExpectedException.none();
				exceptionRule.expect(UserTestException.class);
				result = user.checkPsswd("Kirti@12kumar");
				}catch(UserTestException e) {
        			e.printStackTrace();
        		}
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenImProper_ReturnFalse() {
    	UserRegTest user = new UserRegTest();
    	boolean result=false;
    	try {
    			ExpectedException exceptionRule = ExpectedException.none();
				exceptionRule.expect(UserTestException.class);
				result = user.checkPsswd("kirtikumar");
				}catch(UserTestException e) {
        			e.printStackTrace();
        		}
        Assert.assertEquals(false,result);
    }
}