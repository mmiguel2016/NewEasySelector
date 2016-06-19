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

public class AICCorrosion extends AppCompatActivity {

    ListView lv;
    ArrayList<Item> selectionList=new ArrayList<>();
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiccorrosion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toolbar toolbarBottom = (Toolbar) findViewById(R.id.toolbar_2nd);
        toolbarBottom.setTitle(getString(R.string.title_activity_aiccorrosion));
        toolbarBottom.setTitleTextColor(Color.RED);

        lv=(ListView)findViewById(R.id.android_list);
        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,selectionList);
        lv.setAdapter(myAdapter);
        selectionList.add(new Item(getString(R.string.aiccorrosion1), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aiccorrosion2), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aiccorrosion3), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aiccorrosion4), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aiccorrosion5), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aiccorrosion6), R.drawable.arrow));
        selectionList.add(new Item(getString(R.string.aiccorrosion7), R.drawable.arrow));


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //When clicked, open the new listview
                if (position == 0) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AICCorrosion.this,AICCorrosionDO22.class);
                    startActivity(intent);
                }
                else if (position == 1) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AICCorrosion.this,AICCorrosionDO80.class);
                    startActivity(intent);
                }
                else if (position == 2) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AICCorrosion.this,AICCorrosionDO60.class);
                    startActivity(intent);
                }
                else if (position == 3) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AICCorrosion.this,AICCorrosionDO70.class);
                    startActivity(intent);
                }
                else if (position == 4) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AICCorrosion.this,AICCorrosionDO02.class);
                    startActivity(intent);
                }
                else if (position == 5) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AICCorrosion.this,AICCorrosionCAVITEC.class);
                    startActivity(intent);
                }
                else if (position == 6) {
                    //code specific to 1st list item
                    Intent intent = new Intent(AICCorrosion.this,AICCorrosionDO04.class);
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
        Intent intent = new Intent(AICCorrosion.this, Selections.class);
        startActivity(intent);
        return true;
    }

}
