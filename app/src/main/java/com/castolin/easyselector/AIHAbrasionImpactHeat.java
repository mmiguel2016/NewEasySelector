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

public class AIHAbrasionImpactHeat extends AppCompatActivity {

    ListView lv;
    ArrayList<Item> selectionList=new ArrayList<>();
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aihabrasionimpactheat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toolbar toolbarBottom = (Toolbar) findViewById(R.id.toolbar_2nd);
        toolbarBottom.setTitle(getString(R.string.title_activity_aihabrasionimpactheat));
        toolbarBottom.setTitleTextColor(Color.RED);

        lv=(ListView)findViewById(R.id.android_list);
        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,selectionList);
        lv.setAdapter(myAdapter);
        selectionList.add(new Item(getString(R.string.aihabrasionimpactheat1), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasionimpactheat2), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasionimpactheat3), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasionimpactheat4), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasionimpactheat5), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasionimpactheat6), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasionimpactheat7), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasionimpactheat8), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasionimpactheat9), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aihabrasionimpactheat10), R.drawable.arrow));


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //When clicked, open the new listview
                if (position == 0) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasionImpactHeat.this,AIHAbrasionImpactHeatDO360X.class);
                    startActivity(intent);
                }
                else if (position == 1) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasionImpactHeat.this,AIHAbrasionImpactHeatDO04.class);
                    startActivity(intent);
                }
                else if (position == 2) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasionImpactHeat.this,AIHAbrasionImpactHeatDO60.class);
                    startActivity(intent);
                }
                else if (position == 3) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasionImpactHeat.this,AIHAbrasionImpactHeatDO327.class);
                    startActivity(intent);
                }
                else if (position == 4) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasionImpactHeat.this,AIHAbrasionImpactHeatDO06.class);
                    startActivity(intent);
                }
                else if (position == 5) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasionImpactHeat.this,AIHAbrasionImpactHeatDO329.class);
                    startActivity(intent);
                }
                else if (position == 6) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasionImpactHeat.this,AIHAbrasionImpactHeatDO332.class);
                    startActivity(intent);
                }
                else if (position == 7) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasionImpactHeat.this,AIHAbrasionImpactHeatDO15.class);
                    startActivity(intent);
                }
                else if (position == 8) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasionImpactHeat.this,AIHAbrasionImpactHeat8336EG.class);
                    startActivity(intent);
                }
                else if (position == 9) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AIHAbrasionImpactHeat.this,AIHAbrasionImpactHeatDO390N.class);
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
        Intent intent = new Intent(AIHAbrasionImpactHeat.this, Selections.class);
        startActivity(intent);
        return true;
    }

}
