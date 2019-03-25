package com.example.hey.recyclehw.mock;

import android.support.v4.app.NavUtils;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hey.recyclehw.R;

import java.util.List;

public class Holder extends RecyclerView.ViewHolder {
    private TextView Name;
    private TextView Year;
    private  TextView Description;
    private ImageView Poster;
    private TextView Score;
    private TextView Number;
    private int id;
    private Film film;

    public Holder(View itemView) {
        super(itemView);
        Name = itemView.findViewById(R.id.Namee);
        Year=itemView.findViewById(R.id.Year);
        Description=itemView.findViewById(R.id.Descriptionn);
        Poster=itemView.findViewById(R.id.Poster);
        Score=itemView.findViewById(R.id.Score);
        Number = itemView.findViewById(R.id.item_number);

    }

    public void bind(Film mock, List<Film> filmList){
        Name.setText(mock.getName());
        Year.setText(mock.getYear());
        Description.setText(mock.getDescription());
        Poster.setImageResource(mock.getPoster());
        Score.setText(mock.getScore());
        Number.setText("#"+mock.getNumber());
//        id=mock.getNumber();
       id = filmList.indexOf(mock);
    }

    public void setListener(final Adapter.OnItemClickListener myListener) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myListener.onItemClick(id);
            }
        });
    }

}
