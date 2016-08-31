package com.example.hppc.ariitsme.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hppc.ariitsme.R;

public class AboutMeActivity extends AppCompatActivity {

    Button abutMeNextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        abutMeNextBtn = (Button) findViewById(R.id.AboutMeNxtBtn);
        abutMeNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMeActivity.this, ExperienceActivity.class);
                startActivity(intent);
            }
        });
    }
}
