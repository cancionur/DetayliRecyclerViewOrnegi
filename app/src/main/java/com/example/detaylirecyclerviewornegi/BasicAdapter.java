package com.example.detaylirecyclerviewornegi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class BasicAdapter extends RecyclerView.Adapter <BasicAdapter.ObjectHolder>{

    private Context mContext;
    private List<Movie> moviesList;

    public BasicAdapter(Context mContext, List<Movie> moviesList) {
        this.mContext = mContext;
        this.moviesList = moviesList;
    }

    @NonNull
    @Override
    public ObjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View design = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);

        return new ObjectHolder(design);
    }

    @Override
    public void onBindViewHolder(@NonNull ObjectHolder holder, int position) {

        Movie movie = moviesList.get(position);

        holder.textViewMovieName.setText(movie.getMovieName());
        holder.textViewMoviePrice.setText(movie.getMoviePrice() + " TL");
        holder.imageViewMovie.setImageResource(mContext.getResources()
                .getIdentifier(movie.getMoviePictureName(), "drawable",mContext.getPackageName()));

        holder.buttonBuyIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "You bought a ticket for " + movie.getMovieName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class ObjectHolder extends RecyclerView.ViewHolder{

        private Button buttonBuyIt;
        private ImageView imageViewMovie;
        private TextView textViewMovieName, textViewMoviePrice;

        public ObjectHolder(@NonNull View itemView) {
            super(itemView);

            buttonBuyIt = itemView.findViewById(R.id.buttonBuyIt);
            imageViewMovie = itemView.findViewById(R.id.imageViewMovie);
            textViewMovieName = itemView.findViewById(R.id.textViewMovieName);
            textViewMoviePrice = itemView.findViewById(R.id.textViewMoviePrice);
        }
    }



}
