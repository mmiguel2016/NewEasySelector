package com.castolin.easyselector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;

public class LaunchActivity extends AppCompatActivity {

    private static Button button_selection;
    private static Button button_ReadMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        OnClickButtonListener();
        OnClickButtonListener1();
    }

    public void OnClickButtonListener(){
        button_selection=(Button)findViewById(R.id.ButtonSelection);
        button_selection.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.castolin.easyselector.Selections");
                        startActivity(intent);
                    }
                }
        );
    }

    public void OnClickButtonListener1(){
        button_ReadMe=(Button)findViewById(R.id.ButtonReadme);
        button_ReadMe.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.castolin.easyselector.ReadMe");
                        startActivity(intent);
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launch, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user clicks the home button */
    public void sendMessage(View view){
        Intent intent = new Intent(this, Selections.class);
        startActivity(intent);
    }


}

