package com.castolin.easyselector;

import android.app.ListFragment;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;

public class Selections extends AppCompatActivity {
    private ListView lv;
    //new
    ArrayList<Item> selectionList=new ArrayList<>();

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selections);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toolbar toolbarHeader = (Toolbar) findViewById(R.id.toolbar_2nd);
        toolbarHeader.setTitle(getString(R.string.selections_title));
        toolbarHeader.setTitleTextColor(Color.RED);

        lv=(ListView)findViewById(R.id.android_list);

        //new
        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,selectionList);
        lv.setAdapter(myAdapter);

        selectionList.add(new Item(getString(R.string.Selectionlist1), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.Selectionlist2),R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.Selectionlist3), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.Selectionlist4), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.Selectionlist5), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.Selectionlist6), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.Selectionlist7), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.Selectionlist8), R.drawable.arrow));
        //Row configuration


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //When clicked, open the new listview
                if (position == 0) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Selections.this, AIH.class);
                    startActivity(intent);
                }
                else if (position == 1) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Selections.this, AbrasionImpactCorrosion.class);
                    startActivity(intent);
                }
                else if (position == 2) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Selections.this, AHC.class);
                    startActivity(intent);
                }
                else if (position == 3) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Selections.this, HIC.class);
                    startActivity(intent);
                }
                else if (position == 4) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Selections.this, Erosion.class);
                    startActivity(intent);
                }
                else if (position == 5) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Selections.this, MechanicalFatigue.class);
                    startActivity(intent);
                }
                else if (position == 6) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Selections.this, Cavitation.class);
                    startActivity(intent);
                }
                else if (position == 7) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Selections.this, FrictionAndRubbing.class);
                    startActivity(intent);
                }
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_back, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(Selections.this, LaunchActivity.class);
        startActivity(intent);
        return true;
    }

}