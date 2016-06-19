package com.castolin.easyselector;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by mmiguel on 08.03.2016.
 */
public class DO05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.do05);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toolbar toolbarHeader = (Toolbar) findViewById(R.id.toolbar_2nd);
        toolbarHeader.setTitle(getString(R.string.title_activity_DO05));
        toolbarHeader.setTitleTextColor(Color.RED);

        Toolbar toolbarBottom = (Toolbar) findViewById(R.id.toolbar_bottom);
        toolbarBottom.setTitle(getString(R.string.action_technical_support));
        toolbarBottom.setTitleTextColor(Color.WHITE);
        toolbarBottom.setNavigationIcon(R.drawable.info);


        /* Listener for the bottom toolbar */
        toolbarBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DO05.this, Feedback.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(DO05.this, Selections.class);
        startActivity(intent);
        return true;
    }
}


