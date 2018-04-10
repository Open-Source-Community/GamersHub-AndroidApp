package com.androidexample.gamershub;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private FragmentTransaction transaction;
    private HashMap<Integer, Fragment> fragments = new HashMap();


    public void navigationPages() {
        fragments.put(R.id.action_wall,new WallFragment());
        fragments.put(R.id.action_chat,new ChatFragment());
        fragments.put(R.id.action_group,new GroupFragment());
        fragments.put(R.id.action_Request,new RequestsFragment());
        //Manually displaying the first fragment - one time only

        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout,fragments.get(R.id.action_wall));
        transaction.commit();


    }
    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout, fragments.get(item.getItemId()));
                    transaction.commit();
                    return true;
                }
            };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_layout);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationPages();

        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);



    }



}
