package com.castolin.easyselector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
/**
 * Created by mmiguel on 08.03.2016.
 */
public class DO04 extends AppCompatActivity{

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.do04);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toolbar toolbarHeader = (Toolbar) findViewById(R.id.toolbar_2nd);
        toolbarHeader.setTitle(getString(R.string.title_activity_DO04));
        toolbarHeader.setTitleTextColor(Color.RED);

        Toolbar toolbarBottom = (Toolbar) findViewById(R.id.toolbar_bottom);
        toolbarBottom.setTitle(getString(R.string.action_technical_support));
        toolbarBottom.setTitleTextColor(Color.WHITE);
        toolbarBottom.setNavigationIcon(R.drawable.info);


        /* Listener for the bottom toolbar */
        toolbarBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DO04.this, Feedback.class);
                startActivity(intent);
            }
        });

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add(getString(R.string.application1));
        listDataHeader.add(getString(R.string.application2));
        listDataHeader.add(getString(R.string.application5));

        // Adding child data
        List<String> part = new ArrayList<String>();
        part.add(getString(R.string.DO041));


        List<String> wear = new ArrayList<String>();
        wear.add(getString(R.string.DO042));

        List<String> advantages = new ArrayList<String>();
        advantages.add(getString(R.string.DO043));

        // Header, Child data
        listDataChild.put(listDataHeader.get(0), part);
        listDataChild.put(listDataHeader.get(1), wear);
        listDataChild.put(listDataHeader.get(2),advantages);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(DO04.this, Selections.class);
        startActivity(intent);
        return true;
    }
}

