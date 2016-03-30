package com.castolin.easyselector;

import android.app.ListFragment;
import android.content.Intent;
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

public class AIH extends AppCompatActivity {

    ListView lv;
    ArrayList<Item> selectionList=new ArrayList<>();
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aih);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lv=(ListView)findViewById(R.id.android_list);
        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,selectionList);
        lv.setAdapter(myAdapter);
        selectionList.add(new Item(getString(R.string.AIH1), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.AIH2), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.AIH3), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.AIH4), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.AIH5), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.AIH6), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.AIH7), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.AIH8), R.drawable.arrow));


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
        Intent intent = new Intent(AIH.this, Selections.class);
        startActivity(intent);
        return true;
    }

}
