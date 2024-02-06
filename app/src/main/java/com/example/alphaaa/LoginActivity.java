package com.example.alphaaa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = findViewById(R.id.login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText usernameEditText = findViewById(R.id.username);
                EditText password = findViewById(R.id.password);
                if(usernameEditText.getText().length()<4){
                    Toast.makeText(LoginActivity.this, "Invalid username!!!", Toast.LENGTH_SHORT).show();
                } else if (password.getText().length()<8) {
                    Toast.makeText(LoginActivity.this, "Invalid password!!!", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
