package com.castolin.easyselector;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ReadMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_me);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toolbar toolbarHeader = (Toolbar) findViewById(R.id.toolbar_2nd);
        toolbarHeader.setTitle(getString(R.string.title_activity_read_me));
        toolbarHeader.setTitleTextColor(Color.RED);

        Toolbar toolbarBottom = (Toolbar) findViewById(R.id.toolbar_bottom);
        toolbarBottom.setTitle(getString(R.string.action_technical_support));
        toolbarBottom.setTitleTextColor(Color.WHITE);
        toolbarBottom.setNavigationIcon(R.drawable.info);

                /* Listener for the bottom toolbar */
        toolbarBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReadMe.this, Feedback.class);
                startActivity(intent);
            }
        });

        TextView textView=(TextView) findViewById(R.id.ReadMetextView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_back, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(ReadMe.this, LaunchActivity.class);
        startActivity(intent);
        return true;
    }

}
