package com.androidexample.gamershub;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CategoryAdapter  adapter = new CategoryAdapter(this,getSupportFragmentManager());

    private void setupViewAdapter(ViewPager viewpager)
    {
        adapter.addPage(new HomeFragment(),R.drawable.ic_home_white_24dp,R.string.nav_home);
        adapter.addPage(new ChatFragment(),R.drawable.ic_chat_white_24dp,R.string.nav_chat);
        adapter.addPage(new GroupFragment(),R.drawable.ic_group_white_24dp,R.string.nav_group);
        adapter.addPage(new ListFragment(),R.drawable.ic_list_white_24dp,R.string.nav_list);
        viewpager.setAdapter(adapter);
        viewpager.setOffscreenPageLimit(adapter.getCount());
    }
    private void setupTabsContent(TabLayout taber)
    {
        for (int i = 0; i < adapter.getCount(); i++) {
            LinearLayout tab = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.tab_layout, null);

            // get child TextView and ImageView from this layout for the icon and label
            TextView tab_label = (TextView) tab.findViewById(R.id.tab_text);
            ImageView tab_icon = (ImageView) tab.findViewById(R.id.tab_icon);

            // set the label text by getting the actual string value by its id
            // by getting the actual resource value `getResources().getString(string_id)`
            tab_label.setText(adapter.getPageTitle(i));

            // set the home to be active at first
            /*if (i == 0) {
                tab_label.setTextColor(getResources().getColor(R.color.efent_color));
                tab_icon.setImageResource(navIconsActive[i]);
            } else {
                tab_icon.setImageResource(navIcons[i]);
            }*/
            tab_icon.setImageResource(adapter.getImage(i));



            // finally publish this custom view to navigation tab
            taber.getTabAt(i).setCustomView(tab);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ViewPager pager =(ViewPager)findViewById(R.id.viewpager);

        TabLayout taber = (TabLayout) findViewById(R.id.tab);

        setupViewAdapter(pager);
        taber.setupWithViewPager(pager);
        setupTabsContent(taber);

    }
}
