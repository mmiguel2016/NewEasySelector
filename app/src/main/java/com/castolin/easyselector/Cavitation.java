package com.castolin.easyselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.MenuItem;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;

public class Cavitation extends AppCompatActivity {

    ListView lv;
    ArrayList<Item> selectionList=new ArrayList<>();
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cavitation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lv=(ListView)findViewById(R.id.android_list);
        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,selectionList);
        lv.setAdapter(myAdapter);
        selectionList.add(new Item(getString(R.string.cavitation1), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.cavitation2), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.cavitation3), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.cavitation4), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.cavitation5), R.drawable.arrow));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //When clicked, open the new listview
                if (position == 0) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Cavitation.this, CAVITEC.class);
                    startActivity(intent);
                } else if (position == 1) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Cavitation.this, DO80.class);
                    startActivity(intent);
                } else if (position == 2) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Cavitation.this, DO04.class);
                    startActivity(intent);
                }
                else if (position == 3) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Cavitation.this, DO05.class);
                    startActivity(intent);
                }
                else if (position == 4) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Cavitation.this, DO02Cavitation.class);
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
        Intent intent = new Intent(Cavitation.this, Selections.class);
        startActivity(intent);
        return true;
    }

}
