package com.example.you_fit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    TextInputLayout fullname_var, username_var, email_var,phone_var,password_var;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullname_var = findViewById(R.id.name_register);
        username_var = findViewById(R.id.username_register);
        email_var = findViewById(R.id.email_register);
        phone_var = findViewById(R.id.phone_register);
        password_var = findViewById(R.id.password_register);


    }

    public void loginButtonClick(View view) {
        Intent intent =new Intent(getApplicationContext(), login.class);
        startActivity(intent);
        finish();
    }

    public void signupButtonClick(View view) {



        String fullname_ = fullname_var.getEditText().getText().toString();
        String username_ = username_var.getEditText().getText().toString();
        String email_ = email_var.getEditText().getText().toString();
        String phone_ = phone_var.getEditText().getText().toString();
        String password_ =password_var.getEditText().getText().toString();


        if(!fullname_.isEmpty()){
            fullname_var.setError(null);
            fullname_var.setErrorEnabled(false);
            if(!username_.isEmpty()){
                username_var.setError(null);
                username_var.setErrorEnabled(false);
                if(!email_.isEmpty()) {
                    email_var.setError(null);
                    email_var.setErrorEnabled(false);
                    if (!phone_.isEmpty()) {
                        phone_var.setError(null);
                        phone_var.setErrorEnabled(false);
                        if (!password_.isEmpty()) {
                            password_var.setError(null);
                            password_var.setErrorEnabled(false);
                            if (!email_.isEmpty()) {
                                email_var.setError(null);
                                email_var.setErrorEnabled(false);

                                firebaseDatabase = FirebaseDatabase.getInstance();
                                reference = firebaseDatabase.getReference("datauser");

                                String fullname_s = fullname_var.getEditText().getText().toString();
                                String username_s = username_var.getEditText().getText().toString();
                                String email_s = email_var.getEditText().getText().toString();
                                String phone_s = phone_var.getEditText().getText().toString();
                                String password_s =password_var.getEditText().getText().toString();

                                storingdata storingdatas = new storingdata(fullname_s, username_s, email_s, phone_s, password_s);

                                reference.child(username_s).setValue(storingdatas);

                                Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(getApplicationContext(), dashboard.class);
                                startActivity(intent);

                                finish();

                            } else {
                                email_var.setError("Invalid Email ");
                            }
                        } else {
                            password_var.setError("please enter the password "); }
                    } else {
                        phone_var.setError("please enter the phone number "); }
                } else {
                    email_var.setError("please enter the email "); }
            } else {
                username_var.setError("please enter the user name "); }
        }else {
            fullname_var.setError("please enter the full name "); }







    }
}