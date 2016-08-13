package com.droidtech.fakeloginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    private EditText mNameField;
    private EditText mPasswordField;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText) findViewById(R.id.nameText);
        mPasswordField = (EditText) findViewById(R.id.passwordText);
        mLoginButton = (Button) findViewById(R.id.loginButton);


        mLoginButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //login to a new screen
                String name = mNameField.getText().toString();
                String password = mPasswordField.getText().toString();

                startPage(name, password);

            }
        });
    }


    private void startPage(String name, String password)
    {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("password",password);
        startActivity(intent);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        mPasswordField.setText("");
    }
}
