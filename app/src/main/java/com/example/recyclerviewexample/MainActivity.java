package com.example.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<RecyclerItem> foodInfoArrayList = new ArrayList<>();
        foodInfoArrayList.add(new RecyclerItem("이주용","2학년","소프트웨어 개발과"));
        foodInfoArrayList.add(new RecyclerItem("최승호","2학년","임베디드 소프트웨어 개발과"));
        foodInfoArrayList.add(new RecyclerItem("고정현","2학년","임베디드 소프트웨어 개발과"));
        foodInfoArrayList.add(new RecyclerItem("권민","2학년","임베디드 소프트웨어 개발과"));

        RecyclerAdapter myAdapter = new RecyclerAdapter(foodInfoArrayList);

        mRecyclerView.setAdapter(myAdapter);

    }

}