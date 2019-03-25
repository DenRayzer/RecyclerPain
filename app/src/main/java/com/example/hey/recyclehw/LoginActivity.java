package com.example.hey.recyclehw;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText Login;
    private EditText Password;
    private Button Entry;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);

        Login = findViewById(R.id.login);
        Password = findViewById(R.id.password);
        Entry = findViewById(R.id.Entry_button);

        Entry.setOnClickListener(onEnterClickListener);

    }

 private boolean isLoginValid(){
        return Login.getText().toString().equals("admin");
    }
    private boolean isPasswordValid(){
        return Password.getText().toString().equals("password");
    }

    private View.OnClickListener onEnterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            if (isLoginValid()&&isPasswordValid()){
                Intent intent = new Intent(LoginActivity.this,FilmActivity.class);
                startActivity(intent);
            }
            else  Toast.makeText(LoginActivity.this, "Неверный логин или пароль", Toast.LENGTH_SHORT).show();

        }
    };

}
