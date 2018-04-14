package com.androidexample.gamershub;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ali on 4/4/18.
 */

public class CategoryAdapter extends FragmentStatePagerAdapter {
    public ArrayList<Fragment> pageFragments=new ArrayList<>();
    private List<Integer> navIcons= new ArrayList<>();
    private List<Integer> navStrings= new ArrayList<>();
    private Context contxt;
    public CategoryAdapter(Context Context, android.support.v4.app.FragmentManager fm){
        super(fm);
        contxt=Context;
    }

    public void addPage(Fragment page,int icon,int string)
    {
        pageFragments.add(page);
        navIcons.add(icon);
        navStrings.add(string);
    }

    @Override
    public int getCount() {
        return pageFragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return pageFragments.get(position);
    }


    public int getImage(int position)
    {
        return navIcons.get(position);
    }



    @Override
    public CharSequence getPageTitle(int position) {
        return contxt.getString(navStrings.get(position));
    }
}