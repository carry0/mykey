package com.example.workday.activity;

import android.graphics.Bitmap;
import android.media.Image;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.workday.R;
import com.example.workday.adapter.ViewPagerAdapter;
import java.util.ArrayList;
import java.util.List;

import MyFragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;

    private List<View> mViewList = new ArrayList<>();
    private List<String> listTitles;

    private ArrayList<MainFragment> mainFragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.activity_vp);
        tabLayout = findViewById(R.id.tab);
        initialize();
    }

    private void initialize() {
        mainFragments = new ArrayList<>();
        listTitles = new ArrayList<>();

            listTitles.add("表情帝01");
            listTitles.add("表情帝02");
            listTitles.add("表情帝03");
            listTitles.add("表情帝04");
            listTitles.add("表情帝05");
            listTitles.add("表情帝06");
            listTitles.add("表情帝07");
            listTitles.add("表情帝08");


        for (int i=0;i<listTitles.size();i++){
            MainFragment fragment = new MainFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("index",i);
            bundle.putString("title",listTitles.get(i));
            fragment.setArguments(bundle);
            mainFragments.add(fragment);

        }
        for (int i=0;i<5;i++) {
            tabLayout.addTab(tabLayout.newTab().setText(listTitles.get(i)));
        }
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),
                                                                 mainFragments,listTitles);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }


}
