package com.example.fragment_lyold_unit3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private ArrayList<AnimalModel> animalModels = new ArrayList<>();

    public AnimalAdapter(ArrayList<AnimalModel> animalModels) {
        this.animalModels = animalModels;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        AnimalModel model = animalModels.get(position);
        holder.setData(model);

    }

    @Override
    public int getItemCount() {
        return animalModels.size();
    }
}
