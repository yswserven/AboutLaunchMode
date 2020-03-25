package com.custom.launchmode.ui;

import android.os.Bundle;

import com.custom.launchmode.R;
import com.custom.launchmode.adapter.RecyclerViewAdapter;
import com.custom.launchmode.itemdecoration.RecyclerViewItemDecoration;
import com.custom.launchmode.model.User;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewActivity extends AppCompatActivity {
    private List<User> mData;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mRecyclerView = findViewById(R.id.recyclerView);
        initData();
        initRecyclerView();
    }

    private void initData() {
        mData = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setName("名字_" + i);
            user.setAge("年龄_" + (i + 20));
            mData.add(user);
        }
    }

    private void initRecyclerView() {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mData);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.addItemDecoration(new RecyclerViewItemDecoration());
    }
}
