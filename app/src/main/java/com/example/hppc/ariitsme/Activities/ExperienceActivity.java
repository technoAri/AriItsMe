package com.example.hppc.ariitsme.Activities;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hppc.ariitsme.Fragments.MyFragment;
import com.example.hppc.ariitsme.R;

import java.util.ArrayList;
import java.util.List;

import static android.app.PendingIntent.getActivity;

public class ExperienceActivity extends AppCompatActivity {

    MyPageAdapter pageAdapter;
    TextView tv1, tv2, tvTitleIntoolbar;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_activities);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_activities);
//        AppCompatActivity activity = (AppCompatActivity) getActivity();
//        activity.setSupportActionBar(toolbar);
//        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        backButton = (Button)findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tvTitleIntoolbar = (TextView) findViewById(R.id.tvTitletoolbar2);
        tvTitleIntoolbar.setText("Experience");

        List<Fragment> fragments = getFragments();

        pageAdapter = new MyPageAdapter(getSupportFragmentManager(), fragments);

        ViewPager pager =

                (ViewPager)findViewById(R.id.viewpager);

        pager.setAdapter(pageAdapter);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);

    }

    private List<Fragment> getFragments(){
        List<Fragment> fList = new ArrayList<Fragment>();

        fList.add(MyFragment.newInstance("HI!!!"));
//        tv2.setVisibility(View.INVISIBLE);
        fList.add(MyFragment.newInstance("HELLO!!"));
//        tv2.setVisibility(View.VISIBLE);
//        tv1.setVisibility(View.INVISIBLE);

        //fList.add(MyFragment.newInstance("Fragment 3"));

        return fList;
    }

    private class MyPageAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragments;

        private String tabTitles[] = new String[] { "OVERVIEW", "DETAILS", "" };


        public MyPageAdapter(FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            this.fragments = fragments;
        }
        @Override
        public Fragment getItem(int position) {
            return this.fragments.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // Generate title based on item position
            return tabTitles[position];
        }

        @Override
        public int getCount() {
            return this.fragments.size();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){

        }
        return super.onOptionsItemSelected(item);
    }
}
