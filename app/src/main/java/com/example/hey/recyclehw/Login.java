package com.example.hey.recyclehw;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
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
    private View.OnClickListener onEnterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (true){
                Intent intent = new Intent(Login.this,FilmActivity.class);
                startActivity(intent);
                Toast.makeText(Login.this, "hhh", Toast.LENGTH_SHORT).show();
            }
            else  Toast.makeText(Login.this, "хуй", Toast.LENGTH_SHORT).show();


        }
    };
}