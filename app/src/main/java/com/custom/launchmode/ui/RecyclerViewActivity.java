package com.custom.launchmode.ui;

import android.os.Bundle;

import com.custom.launchmode.R;
import com.custom.launchmode.adapter.RecyclerViewAdapter;
import com.custom.launchmode.itemdecoration.RecyclerViewItemDecoration;
import com.custom.launchmode.model.User;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewActivity extends AppCompatActivity {
    private List<User> mData;
    private List<User> yuWenList;
    private List<User> otherList;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mRecyclerView = findViewById(R.id.recyclerView);
        initData();
    }

    private void initData() {
        mData = new ArrayList<>();
        yuWenList = new ArrayList<>();
        otherList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            yuWenList.add(new User("语文" + i, i));
        }
        for (int i = 0; i < 3; i++) {
            otherList.add(new User("其他" + i, i));
        }
        mData.add(new User("语文", 0));
        mData.addAll(yuWenList);
        mData.add(new User("其他", 1));
        mData.addAll(otherList);
        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mData);
        GridLayoutManager manager = new GridLayoutManager(this, 3);
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position == 0) {
                    return 3;
                } else if (position == yuWenList.size() + 1) {
                    return 3;
                } else {
                    return 1;
                }
            }
        });
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.addItemDecoration(new RecyclerViewItemDecoration());
    }
}
