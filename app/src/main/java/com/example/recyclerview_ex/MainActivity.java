package com.example.recyclerview_ex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        List<com.example.recyclerview_ex.ExpandableListAdapter.Item> data = new ArrayList<>();

        data.add(new com.example.recyclerview_ex.ExpandableListAdapter.Item(com.example.recyclerview_ex.ExpandableListAdapter.HEADER,"Fruits"));
        data.add(new com.example.recyclerview_ex.ExpandableListAdapter.Item(com.example.recyclerview_ex.ExpandableListAdapter.CHILD,"Apple"));
        data.add(new com.example.recyclerview_ex.ExpandableListAdapter.Item(com.example.recyclerview_ex.ExpandableListAdapter.CHILD,"Orange"));
        data.add(new com.example.recyclerview_ex.ExpandableListAdapter.Item(com.example.recyclerview_ex.ExpandableListAdapter.CHILD,"Banana"));
        data.add(new com.example.recyclerview_ex.ExpandableListAdapter.Item(com.example.recyclerview_ex.ExpandableListAdapter.HEADER,"Cars"));
        data.add(new com.example.recyclerview_ex.ExpandableListAdapter.Item(com.example.recyclerview_ex.ExpandableListAdapter.CHILD,"Audi"));
        data.add(new com.example.recyclerview_ex.ExpandableListAdapter.Item(com.example.recyclerview_ex.ExpandableListAdapter.CHILD,"Aston Martin"));
        data.add(new com.example.recyclerview_ex.ExpandableListAdapter.Item(com.example.recyclerview_ex.ExpandableListAdapter.CHILD,"BMW"));
        data.add(new com.example.recyclerview_ex.ExpandableListAdapter.Item(com.example.recyclerview_ex.ExpandableListAdapter.CHILD,"Cadillac"));

        recyclerView.setAdapter(new com.example.recyclerview_ex.ExpandableListAdapter(data));

    }
}