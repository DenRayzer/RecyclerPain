package com.example.hey.recyclehw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hey.recyclehw.mock.Film;
import com.example.hey.recyclehw.mock.Holder;

public class ConcreteFilmActivity  extends AppCompatActivity {

    public static final int User_id = 1;

    private ImageView Poster;
    private TextView Name,Description,Actors;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concrete_fim_layout);

        Poster=findViewById(R.id.Poster);
        Name=findViewById(R.id.Name);
        Description=findViewById(R.id.Description);
        Actors=findViewById(R.id.Actors);

    }

    }


