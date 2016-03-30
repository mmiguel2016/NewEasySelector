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

public class Selections extends AppCompatActivity {
    private ListView lv;
    //new
    ArrayList<Item> selectionList=new ArrayList<>();

    /**ListActivity
     * AppCompatActivity
     * Activity
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    private GoogleApiClient client;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selections);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Selections Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.castolin.easyselector/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Selections Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.castolin.easyselector/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}