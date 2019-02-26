package com.example.workday.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import java.util.ArrayList;
import java.util.List;

import MyFragment.MainFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<MainFragment> mainFragments;
    private List<String> listTile;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<MainFragment> mainFragments,
                            List<String> listTile) {
        super(fm);
        this.mainFragments = mainFragments;
        this.listTile = listTile;
    }

    /**
     * 根据位置返回对应的mainFragments
     * @param i
     * @return
     */
    @Override
    public Fragment getItem(int i) {
        return mainFragments.get(i);
    }

    @Override
    public int getCount() {
        return mainFragments==null ? 0:mainFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTile.get(position);
    }

}
