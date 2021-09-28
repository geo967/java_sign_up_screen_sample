package com.example.signupscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    TextInputLayout email, password;
    Button signUpButton;
    String inputEmail, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.id_email);
        password = findViewById(R.id.id_password);
        signUpButton = findViewById(R.id.id_sign_up);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validateEmail(inputEmail);
                validatePassword(inputPassword);

                //  validator.validateInputs(inputEmail,inputPassword);
            }
        });
    }

    public boolean validateEmail(String inputEmail) {
        final String regex = "^(.+)@(.+)$";
        inputEmail = email.getEditText().getText().toString().trim();
        if (inputEmail.isEmpty()) {
            email.setError("Field is empty");
            return false;
        } else if (!inputEmail.matches(regex)) {
            email.setError("not a valid email format");
            return false;
        } else {
            email.setError(null);
            return true;
        }
    }

    public boolean validatePassword(String inputPassword) {
        final String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=()])(?=\\S+$).{8,20}$";
        inputPassword = password.getEditText().getText().toString().trim();

        if (inputPassword.isEmpty()) {
            password.setError("Field is empty");
            return false;
        } else if (!inputPassword.matches(regex)) {
            password.setError("not a valid password format");
            return false;
        } else {
            password.setError(null);
            return true;
        }

    }
}