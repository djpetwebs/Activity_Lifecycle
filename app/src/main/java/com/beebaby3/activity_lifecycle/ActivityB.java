package com.beebaby3.activity_lifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
/*        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        Log.d("ACTIVITY B", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ACTIVITY B", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ACTIVITY B", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ACTIVITY B", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ACTIVITY B", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ACTIVITY B", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ACTIVITY B", "onRestart");
    }

}
