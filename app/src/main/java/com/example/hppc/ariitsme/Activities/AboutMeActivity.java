package com.example.hppc.ariitsme.Activities;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hppc.ariitsme.R;

public class AboutMeActivity extends AppCompatActivity {

    Button abutMeNextBtn, backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_activities);
        setSupportActionBar(toolbar);

        abutMeNextBtn = (Button) findViewById(R.id.AboutMeNxtBtn);
//        abutMeNextBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(AboutMeActivity.this, ExperienceActivity.class);
//                startActivity(intent);
//            }
//        });

        backButton = (Button)findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(AboutMeActivity.this, HomeScreenActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
//                //intent.setClassName(AboutMeActivity.this, HomeScreenActivity.class);
//                startActivity(intent);
            }
        });
//        menuButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(HomeScreenActivity.mDrawerLayout.isDrawerOpen(Gravity.LEFT))
////                    HomeScreenActivity.mDrawerLayout.closeDrawer(Gravity.LEFT);
//                HomeScreenActivity.mDrawerLayout.setVisibility(View.VISIBLE);
////                else
//                    HomeScreenActivity.mDrawerLayout.openDrawer(Gravity.LEFT);
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.back_button) // Press Back Icon
        {
            finish();
            Toast.makeText(this.getApplicationContext(), "Ended", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
