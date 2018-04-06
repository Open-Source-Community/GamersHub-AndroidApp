package com.androidexample.gamershub;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ali on 4/4/18.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(Context Context, android.support.v4.app.FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case  0:
                return new GroupFragment();
            case  1:
                return new HomeFragment();
            case  2:
                return new SettingsFragment();
            default:
                return null;

        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case  0:
                return "Group";
            case  1:
                return "Home";
            case  2:
                return "Settings";
            default:
                return null;

        }
    }
}