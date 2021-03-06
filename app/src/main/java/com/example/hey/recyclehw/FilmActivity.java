package com.example.hey.recyclehw;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.hey.recyclehw.mock.Adapter;
import com.example.hey.recyclehw.mock.Film;
import com.example.hey.recyclehw.mock.Holder;

public class FilmActivity extends AppCompatActivity implements Adapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, RecycleFragment.newInstance()).commit();
        }
    }

    @Override
    public void onItemClick(int id) {

        Intent intent = new Intent(FilmActivity.this, ConcreteFilmActivity.class);
        intent.putExtra(ConcreteFilmActivity.User_id, id);
        startActivity(intent);
    }
}
