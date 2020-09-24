package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText password;
    EditText confirm;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.namet);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirm = findViewById(R.id.confirm);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(name.getText().toString()))
                    Toast.makeText(FormActivity.this, "Please fill in all information.", Toast.LENGTH_LONG).show();
                else if(TextUtils.isEmpty(email.getText().toString()))
                    Toast.makeText(FormActivity.this, "Please fill in all information.", Toast.LENGTH_LONG).show();
                else if(TextUtils.isEmpty(password.getText().toString()))
                    Toast.makeText(FormActivity.this, "Please fill in all information.", Toast.LENGTH_LONG).show();
                else if (TextUtils.isEmpty(confirm.getText().toString()))
                    Toast.makeText(FormActivity.this, "Please fill in all information.", Toast.LENGTH_LONG).show();
                else if(!TextUtils.equals(password.getText().toString(), confirm.getText().toString()))
                    Toast.makeText(FormActivity.this, "Password does not match, please try again.", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(FormActivity.this,"Welcome, "+ name.getText().toString() + ", to the SignUpForm App", Toast.LENGTH_LONG).show();

            }
        });

//test

    }
}