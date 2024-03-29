package com.example.salesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        EditText userName = (EditText)findViewById(R.id.usernameText);
        EditText password = (EditText)findViewById(R.id.passwordText);

        userName.setOnEditorActionListener(new TextView.OnEditorActionListener(){

            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i == EditorInfo.IME_ACTION_NEXT){
                    password.requestFocus();
                    return true;
                }
                return false;
            }
        });

        if(userName.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            Snackbar.make(view, "Login Succesfull", Snackbar.LENGTH_SHORT).show();
        }else {
            Snackbar.make(view, "Login Unsuccesfull", Snackbar.LENGTH_SHORT).show();
        }

    }
}