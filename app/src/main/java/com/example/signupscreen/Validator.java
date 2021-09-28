package com.example.signupscreen;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    private static final String EMAIL_PATTERN= "^(.+)@(.+)$";
    private static final String PASSWORD_PATTERN= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=()])(?=\\S+$).{8,20}$";

    public boolean validateInputs(String email, String password){
        if(email.matches(EMAIL_PATTERN) && password.matches(PASSWORD_PATTERN)){
            return true;
        }
        return false;
    }
}
