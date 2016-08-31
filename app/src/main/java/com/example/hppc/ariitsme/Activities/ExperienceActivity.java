package com.example.hppc.ariitsme.Activities;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.hppc.ariitsme.Fragments.MyFragment;
import com.example.hppc.ariitsme.R;

import java.util.ArrayList;
import java.util.List;

public class ExperienceActivity extends FragmentActivity {

    MyPageAdapter pageAdapter;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

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

}
