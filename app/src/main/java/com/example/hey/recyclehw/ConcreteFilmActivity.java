package com.example.hey.recyclehw;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hey.recyclehw.mock.Film;
import com.example.hey.recyclehw.mock.FilmGenerator;
import com.example.hey.recyclehw.mock.Holder;

public class ConcreteFilmActivity extends AppCompatActivity {

    public static String User_id = "1";
    private ImageView Poster;
    private TextView Name, Description, Actors,Year,Score,Awards,Website,Number;
    private String id;

    Intent intent = getIntent();

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concrete_film_layout2);

        Bundle bundle = getIntent().getExtras();
        id = bundle.getString(User_id);

        final Film thisFilm = FilmGenerator.generate().get(Integer.parseInt(id) - 1);

        Poster = findViewById(R.id.Poster);
        Name = findViewById(R.id.Name);
        Description = findViewById(R.id.Description);
        Actors = findViewById(R.id.Actors);
        Year = findViewById((R.id.Year));
        Score = findViewById((R.id.Score));
        Awards = findViewById((R.id.Awards));
        Website = findViewById((R.id.Website));
        Number = findViewById((R.id.Number));

        bind(thisFilm);
    }

    public void bind(Film mock) {
        Name.setText(mock.getName());
        Description.setText(mock.getDescription());
        Poster.setImageResource(mock.getPoster());
        Actors.setText(mock.getActors());
        Year.setText(mock.getYear());
        Score.setText(mock.getScore());
        Awards.setText(mock.getAwards());
        Website.setText(mock.getWebsite());
        Number.setText("#"+mock.getNumber());
    }

}


