package com.beebaby3.activity_lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    Button bMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bMove = (Button) findViewById(R.id.button1);
        bMove.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(ActivityA.this, ActivityB.class);
                startActivity(i);
            }
        });

        Log.d("ACTIVITY A", "onCreate");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ACTIVITY A", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ACTIVITY A", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ACTIVITY A", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ACTIVITY A", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ACTIVITY A", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ACTIVITY A", "onRestart");
    }
}
