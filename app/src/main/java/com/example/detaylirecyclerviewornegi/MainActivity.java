package com.example.detaylirecyclerviewornegi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<Movie> movieList = new ArrayList<>();
    private BasicAdapter basicAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        Movie movie1 = new Movie("Django","django",24.99);
        Movie movie2 = new Movie("Bir Zamanlar Anadoluda","birzamanlaranadoluda",20.99);
        Movie movie3 = new Movie("Inception","inception",23.99);
        Movie movie4 = new Movie("Interstellar","interstellar",30.99);
        Movie movie5 = new Movie("The Pianist","thepianist",24.99);
        Movie movie6 = new Movie("The Hateful Eight","thehatefuleight",19.99);

        movieList.add(movie1);movieList.add(movie2);movieList.add(movie3);movieList.add(movie4);movieList.add(movie5);movieList.add(movie6);

        basicAdapter = new BasicAdapter(this,movieList);
        rv.setAdapter(basicAdapter);





    }
}