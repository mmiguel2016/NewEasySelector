package com.castolin.easyselector;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
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

public class Erosion extends AppCompatActivity {

    ListView lv;
    ArrayList<Item> selectionList=new ArrayList<>();
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erosion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lv=(ListView)findViewById(R.id.android_list);
        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,selectionList);
        lv.setAdapter(myAdapter);
        selectionList.add(new Item(getString(R.string.erosion1), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.erosion2), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.erosion3), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.erosion4), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.erosion5), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.erosion6), R.drawable.arrow));


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //When clicked, open the new listview
                if (position == 0) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Erosion.this,DO390N.class);
                    startActivity(intent);
                }
                else if (position == 1) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Erosion.this, EG8336.class);
                    startActivity(intent);
                }
                else if (position == 2) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Erosion.this, DO48.class);
                    startActivity(intent);
                }
                else if (position == 3) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Erosion.this, DO11.class);
                    startActivity(intent);
                }
                else if (position == 4) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Erosion.this, DO33.class);
                    startActivity(intent);
                }
                else if (position == 5) {
                    //code specific to 1st list item
                    Intent intent = new Intent(Erosion.this, DO322.class);
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
        Intent intent = new Intent(Erosion.this, Selections.class);
        startActivity(intent);
        return true;
    }

}
