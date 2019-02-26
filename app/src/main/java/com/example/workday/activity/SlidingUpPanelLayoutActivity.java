package com.example.workday.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.workday.R;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class SlidingUpPanelLayoutActivity extends AppCompatActivity {
    private SlidingUpPanelLayout slidingUpPanelLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        slidingUpPanelLayout=findViewById(R.id.slding_layout);

    }
}
