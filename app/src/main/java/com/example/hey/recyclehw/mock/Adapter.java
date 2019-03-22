package com.example.hey.recyclehw.mock;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hey.recyclehw.R;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Holder> {

    private static OnItemClickListener myListener;
    public final List<Film> myFilmList = new ArrayList<>();


    @Override
   public Holder onCreateViewHolder(ViewGroup parent, int viewType){

       LayoutInflater inflater=LayoutInflater.from(parent.getContext());

      View view = inflater.inflate(R.layout.list_item,parent,false);


      return new Holder(view);
   }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bind(myFilmList.get(position));
        holder.setListener(myListener);
    }

    @Override
    public int getItemCount() {
        return myFilmList.size();
    }

    public void addData(List<Film> Films){
        myFilmList.addAll(Films);
        notifyDataSetChanged();
    }

    public static void setListener(OnItemClickListener itemListener) {
        myListener=itemListener;
    }

    public interface OnItemClickListener{
       void onItemClick(String id);

       /*   view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = movieHolder.getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    Movie movie = movieArrayList.get(position);
                    MovieGenerator.getInstance().setMovie(movie);
                    Intent intent = new Intent(movieActivity, MovieItemActivity.class);
                    movieActivity.startActivity(intent);
                }
            }
        });*/


    }

}

