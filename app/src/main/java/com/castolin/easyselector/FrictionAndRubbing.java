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
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class FrictionAndRubbing extends AppCompatActivity {

    ListView lv;
    ArrayList<Item> selectionList=new ArrayList<>();
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friction_and_rubbing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toolbar toolbarBottom = (Toolbar) findViewById(R.id.toolbar_2nd);
        toolbarBottom.setTitle(getString(R.string.title_activity_friction_and_rubbing));
        toolbarBottom.setTitleTextColor(Color.RED);

        lv=(ListView)findViewById(R.id.android_list);
        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,selectionList);
        lv.setAdapter(myAdapter);
        selectionList.add(new Item(getString(R.string.frictionrubbing1), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.frictionrubbing2), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.frictionrubbing3), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.frictionrubbing4), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.frictionrubbing5), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.frictionrubbing6), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.frictionrubbing7), R.drawable.arrow));


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //When clicked, open the new listview
                if (position == 0) {
                    //code specific to 1st list item
                    Intent intent = new Intent(FrictionAndRubbing.this,DO80FrictionRubbing.class);
                    startActivity(intent);
                }
                else if (position == 1) {
                    //code specific to 1st list item
                    Intent intent = new Intent(FrictionAndRubbing.this, DO70.class);
                    startActivity(intent);
                }
                else if (position == 2) {
                    //code specific to 1st list item
                    Intent intent = new Intent(FrictionAndRubbing.this, DO60.class);
                    startActivity(intent);
                }
                else if (position == 3) {
                    //code specific to 1st list item
                    Intent intent = new Intent(FrictionAndRubbing.this, DO329.class);
                    startActivity(intent);
                }
                else if (position == 4) {
                    //code specific to 1st list item
                    Intent intent = new Intent(FrictionAndRubbing.this, DO06.class);
                    startActivity(intent);
                }
                else if (position == 5) {
                    //code specific to 1st list item
                    Intent intent = new Intent(FrictionAndRubbing.this, DO360X.class);
                    startActivity(intent);
                }
                else if (position == 6) {
                    //code specific to 1st list item
                    Intent intent = new Intent(FrictionAndRubbing.this, DO04FrictionRubbing.class);
                    startActivity(intent);
                }
            }
        });
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(FrictionAndRubbing.this, Selections.class);
        startActivity(intent);
        return true;
    }

}

