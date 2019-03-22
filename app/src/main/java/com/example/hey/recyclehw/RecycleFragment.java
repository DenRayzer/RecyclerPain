package com.example.hey.recyclehw;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hey.recyclehw.mock.Adapter;
import com.example.hey.recyclehw.mock.Film;
import com.example.hey.recyclehw.mock.FilmGenerator;

public class RecycleFragment extends Fragment {

    private static RecyclerView myRecycler;
    private final Adapter myAdapter = new Adapter();

    private Adapter.OnItemClickListener itemListener;

    public static RecycleFragment newInstance(){
        return new RecycleFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Adapter.OnItemClickListener) {
        }
        itemListener = (Adapter.OnItemClickListener) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fr_recycler,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        myRecycler=view.findViewById(R.id.recycler);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        myRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        myRecycler.setAdapter(myAdapter);
        Adapter.setListener(itemListener);
        myAdapter.addData(FilmGenerator.generate());
    }

    @Override
    public void onDetach() {
        itemListener = null;
        super.onDetach();
    }
}
