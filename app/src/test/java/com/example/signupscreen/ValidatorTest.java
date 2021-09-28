package com.example.signupscreen;

import com.google.errorprone.annotations.DoNotMock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ValidatorTest {

    Validator validator;

    @Before
    public void setUp(){
        validator=new Validator();
    }

    @Test
    public void givenValidUsernameAndPasswordThenReturnTrue(){
        Boolean result=validator.validateInputs("alice.bob@example.com","Tcs@121ds");
        assertEquals(result,true);
    }
    @Test
    public void givenInValidUsernameAndPasswordThenReturnFalse(){
        Boolean result=validator.validateInputs("geogmail.com","Tcs@121ds");
        assertEquals(result,false);
    }
    @Test
    public void checkCredentials3(){
        Boolean result=validator.validateInputs("geo@gmail.com","Tcs121ds");
        assertEquals(result,false);
    }
    @Test
    public void checkCredentials4(){
        Boolean result=validator.validateInputs("geo@gmail.com","Tcs@ds");
        assertEquals(result,false);
    }
    @Test
    public void checkCredentials5(){
        Boolean result=validator.validateInputs("geo@gmail.com","cs@121ds");
        assertEquals(result,false);
    }
}