package com.userregnewconti;
import com.userregnew.UserRegTest;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class UserTest {
    @Test 
    public void givenFirstName_WhenProper_ReturnTrue() {
    	UserRegTest user = new UserRegTest();
        boolean result = user.checkFname("Kirti");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenImProper_ReturnFalse() {
    	UserRegTest user = new UserRegTest();
        boolean result = user.checkFname("kirti");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenLastName_WhenProper_ReturnTrue() {
    	UserRegTest user = new UserRegTest();
        boolean result = user.checkLname("Kumar");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenImProper_ReturnFalse() {
    	UserRegTest user = new UserRegTest();
        boolean result = user.checkLname("kumar");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenEmail_WhenProper_ReturnTrue() {
    	UserRegTest user = new UserRegTest();
        boolean result = user.checkEmail("krtkumar08@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WhenImProper_ReturnFalse() {
    	UserRegTest user = new UserRegTest();
        boolean result = user.checkEmail("Krtkumar@08@gmail.com");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumb_WhenProper_ReturnTrue() {
    	UserRegTest user = new UserRegTest();
        boolean result = user.checkPhoneNumber("91 8837898455");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenP_WhenImProper_ReturnFalse() {
    	UserRegTest user = new UserRegTest();
        boolean result = user.checkPhoneNumber("987456");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPassword_WhenProper_ReturnTrue() {
    	UserRegTest user = new UserRegTest();
        boolean result = user.checkPsswd("Kirti@12kumar");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenImProper_ReturnFalse() {
    	UserRegTest user = new UserRegTest();
        boolean result = user.checkPsswd("kirtikumar");
        Assert.assertEquals(false,result);
    }
}