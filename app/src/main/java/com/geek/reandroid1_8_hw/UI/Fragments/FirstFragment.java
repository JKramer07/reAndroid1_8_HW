package com.geek.reandroid1_8_hw.UI.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.geek.reandroid1_8_hw.R;
import com.geek.reandroid1_8_hw.UI.Activities.FirstAdapter;
import com.geek.reandroid1_8_hw.UI.Activities.Model;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private ArrayList<Model> list;
    private RecyclerView rv;
    private FirstAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        rv = view.findViewById(R.id.firstRecycler);
        adapter = new FirstAdapter();
        rv.setAdapter(adapter);
        adapter.setList(list);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Model("John", "Smith", "img", R.drawable.rectangle));
        list.add(new Model("John", "Smith", "non"));
        list.add(new Model("John", "Smith", "img", R.drawable.rectangle));
        list.add(new Model("John", "Smith", "non"));
        list.add(new Model("John", "Smith", "img", R.drawable.rectangle));
        list.add(new Model("John", "Smith", "img", R.drawable.rectangle));
        list.add(new Model("John", "Smith", "img", R.drawable.rectangle));
        list.add(new Model("John", "Smith", "non"));
        list.add(new Model("John", "Smith", "non"));
        list.add(new Model("John", "Smith", "non"));
        list.add(new Model("John", "Smith", "img", R.drawable.rectangle));
        list.add(new Model("John", "Smith", "img", R.drawable.rectangle));
        list.add(new Model("John", "Smith", "non"));
        list.add(new Model("John", "Smith", "non"));
        list.add(new Model("John", "Smith", "img", R.drawable.rectangle));
        list.add(new Model("John", "Smith", "img", R.drawable.rectangle));
    }
}