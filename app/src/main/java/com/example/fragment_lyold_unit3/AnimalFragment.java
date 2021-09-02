package com.example.fragment_lyold_unit3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AnimalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AnimalFragment extends Fragment {


    private ImageView img;
    private TextView tv;
    private RecyclerView recyclerView;
    private ArrayList<AnimalModel> arrayList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initview(view);
        buildData(view);
        setRecycleView();
    }

    private void setRecycleView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(arrayList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setAdapter(animalAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);

    }

    private void buildData(View view) {
        for(int i = 0;  i < 10;  i++){
            AnimalModel animalModel = new AnimalModel(R.drawable.yuvan, "Yuvan");
            arrayList.add(animalModel);
            AnimalModel animalModel1 = new AnimalModel(R.drawable.yuvan1, "Yuvan");
            arrayList.add(animalModel1);
        }
    }

    private void initview(View view) {
        recyclerView = view.findViewById(R.id.rvRecycleView);

    }
}