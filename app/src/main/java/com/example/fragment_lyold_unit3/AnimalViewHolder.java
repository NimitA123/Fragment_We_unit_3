package com.example.fragment_lyold_unit3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private ImageView billImage;
    private TextView billName;
    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);

    }

    private void initView(View itemView) {
        billImage = itemView.findViewById(R.id.ivAnimal);
        billName = itemView.findViewById(R.id.tvName);

    }
    public void setData(AnimalModel model){
        billImage.setImageResource(model.getImageView());
        billName.setText(model.getTv());
    }
}
