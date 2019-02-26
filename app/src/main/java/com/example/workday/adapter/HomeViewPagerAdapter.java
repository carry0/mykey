package com.example.workday.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import MyFragment.HomeFragment;
import MyFragment.MainFragment;

public class HomeViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<HomeFragment> homeFragments;

    public HomeViewPagerAdapter(FragmentManager fm, ArrayList<HomeFragment> homeFragments) {
        super(fm);
        this.homeFragments = homeFragments;
    }

    /**
     * 根据位置返回对应的mainFragments
     * @param i
     * @return
     */
    @Override
    public Fragment getItem(int i) {
        return homeFragments.get(i);
    }

    @Override
    public int getCount() {
        return homeFragments==null ? 0:homeFragments.size();
    }

}
