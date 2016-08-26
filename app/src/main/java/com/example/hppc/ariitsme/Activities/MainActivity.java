package com.example.hppc.ariitsme.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.hppc.ariitsme.R;

public class MainActivity extends AppCompatActivity {

    TextView nextTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextTV = (TextView)findViewById(R.id.nextPress);

        nextTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HomeScreenActivity.class);
                startActivity(intent);
            }
        });
    }
}
