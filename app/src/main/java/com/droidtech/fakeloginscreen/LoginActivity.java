package com.droidtech.fakeloginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity
{

    private TextView mTextView;
    private TextView mTextView2;
    private Button mLogoutButton;
    private String name;
    private String password;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();

        name = intent.getStringExtra(getString(R.string.app_name));
        password = intent.getStringExtra(getString(R.string.app_name));

        mTextView = (TextView) findViewById(R.id.nameResultView);
        mTextView2 = (TextView) findViewById(R.id.passwordTextView);
        mLogoutButton = (Button) findViewById(R.id.restartButton);


        //String value = getIntent().getExtras().getString("key");


        mTextView.setText(intent.getStringExtra("name"));
        mTextView2.setText(intent.getStringExtra("password"));

        mLogoutButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
    }


}
