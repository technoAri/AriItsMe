package com.example.hppc.ariitsme.Activities;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.hppc.ariitsme.Adapters.DrawerItemCustomAdapter;
import com.example.hppc.ariitsme.Objects.ObjectDrawerItem;
import com.example.hppc.ariitsme.R;

public class HomeScreenActivity extends AppCompatActivity {

    private String[] mNavigationDrawerItemTitles;
    public static DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    Button menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        mNavigationDrawerItemTitles = getResources().getStringArray(R.array.navigation_drawer_items_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        menuButton = (Button)findViewById(R.id.menu_button);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mDrawerLayout.isDrawerOpen(Gravity.LEFT))
                    mDrawerLayout.closeDrawer(Gravity.LEFT);
                else
                    mDrawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        ObjectDrawerItem[] drawerItem = new ObjectDrawerItem[3];

        drawerItem[0] = new ObjectDrawerItem(R.drawable.ic_plus, "About Me");
        drawerItem[1] = new ObjectDrawerItem(R.drawable.ic_plus, "Experience");
        drawerItem[2] = new ObjectDrawerItem(R.drawable.ic_plus, "Achievements");

        DrawerItemCustomAdapter adapter = new DrawerItemCustomAdapter(this, R.layout.listview_drawer_items, drawerItem);
        mDrawerList.setAdapter(adapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectItem(position);
            }
        });
    }

    private void selectItem(int position) {


        switch (position) {
            case 0:
                Intent intent = new Intent(HomeScreenActivity.this, AboutMeActivity.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(HomeScreenActivity.this, ExperienceActivity.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(HomeScreenActivity.this, AboutMeActivity.class);
                startActivity(intent2);
                break;

            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
