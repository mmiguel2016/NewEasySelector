package com.castolin.easyselector;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class AIHAbrasion extends AppCompatActivity {

    ListView lv;
    ArrayList<Item> selectionList=new ArrayList<>();
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aihabrasion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toolbar toolbarBottom = (Toolbar) findViewById(R.id.toolbar_2nd);
        toolbarBottom.setTitle(getString(R.string.title_activity_aihabrasion));
        toolbarBottom.setTitleTextColor(Color.RED);

        lv=(ListView)findViewById(R.id.android_list);
        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,selectionList);
        lv.setAdapter(myAdapter);
        selectionList.add(new Item(getString(R.string.aihabrasion1), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion2), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion3), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion4), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion5), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion6), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion7), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion8), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion9), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion10), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion11), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasion12), R.drawable.arrow));


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //When clicked, open the new listview
                if (position == 0) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO48.class);
                    startActivity(intent);
                }
                else if (position == 1) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO390N.class);
                    startActivity(intent);
                }
                else if (position == 2) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasion8336EG.class);
                    startActivity(intent);
                }
                else if (position == 3) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO11.class);
                    startActivity(intent);
                }
                else if (position == 4) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO33.class);
                    startActivity(intent);
                }
                else if (position == 5) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO30.class);
                    startActivity(intent);
                }
                else if (position == 6) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO322.class);
                    startActivity(intent);
                }
                else if (position == 7) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO31.class);
                    startActivity(intent);
                }
                else if (position == 8) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO06.class);
                    startActivity(intent);
                }
                else if (position == 9) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO360X.class);
                    startActivity(intent);
                }
                else if (position == 10) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO15.class);
                    startActivity(intent);
                }
                else if (position == 11) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasion.this,AIHAbrasionDO13.class);
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
        Intent intent = new Intent(AIHAbrasion.this, Selections.class);
        startActivity(intent);
        return true;
    }

}
