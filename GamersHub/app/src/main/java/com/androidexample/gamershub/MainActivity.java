package com.androidexample.gamershub;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        CategoryAdapter adapter = new CategoryAdapter(this,getSupportFragmentManager());

        ViewPager pager =(ViewPager)findViewById(R.id.viewpager);

        pager.setAdapter(adapter);
        pager.setOffscreenPageLimit(adapter.getCount());


        TabLayout taber = (TabLayout) findViewById(R.id.tab);

        taber.setupWithViewPager(pager);

    }
}
