package com.geek.reandroid1_8_hw.UI.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.reandroid1_8_hw.R;
import com.geek.reandroid1_8_hw.UI.Activities.Model;
import com.geek.reandroid1_8_hw.UI.Activities.SecondAdapter;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private RecyclerView rv;
    private SecondAdapter adapter;
    private ArrayList<Model> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        rv = view.findViewById(R.id.secondRecycler);
        adapter = new SecondAdapter();
        rv.setAdapter(adapter);
        adapter.setList(list);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Model("John", 5));
        list.add(new Model("John", 15));
        list.add(new Model("John", 2));
        list.add(new Model("John", 8));
        list.add(new Model("John", 20));
        list.add(new Model("John", 500));
        list.add(new Model("John", 81));
        list.add(new Model("John", 5));
        list.add(new Model("John", 66));
        list.add(new Model("John", 222));
        list.add(new Model("John", 5));
    }
}