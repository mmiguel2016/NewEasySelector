package com.castolin.easyselector;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText name = (EditText) findViewById(R.id.editNameOfCustomer);
        final EditText country = (EditText) findViewById(R.id.editCountry);
        final EditText company = (EditText) findViewById(R.id.editCompany);
        final EditText customerEmail = (EditText) findViewById(R.id.editEmail);
        final EditText phone = (EditText) findViewById(R.id.editPhone);
        final EditText description = (EditText) findViewById(R.id.editDescription);

        Button sendFeedback = (Button) findViewById(R.id.buttonSendFeedback);
        sendFeedback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //TODO Auto-generated method stub

                if (  ( !name.getText().toString().equals("")) && ( !country.getText().toString().equals("")) && ( !company.getText().toString().equals("") )&& ( !customerEmail.getText().toString().equals(""))&& ( !phone.getText().toString().equals(""))&& ( !description.getText().toString().equals("")) ) {
                    Intent email = new Intent(android.content.Intent.ACTION_SEND);

            /* Fill it with Data */
                    //email.setType("plain/text");

                    email.setType("message/rfc822");
                    email.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"sserban@castolin.com"});
                    email.putExtra(android.content.Intent.EXTRA_CC, new String[]{"mmiguel@castolin.com"});
                    email.putExtra(android.content.Intent.EXTRA_SUBJECT, (getString(R.string.EmailTechnicalSupport)));
                    email.putExtra(android.content.Intent.EXTRA_TEXT,
                            "Full name: " + name.getText().toString() + '\n' + '\n' + "Country: " + country.getText().toString() + '\n' + '\n' + "Company: " + company.getText().toString() + '\n' + '\n' + "Email address: " + customerEmail.getText().toString() + '\n' + '\n' + "Telephone number: " + phone.getText().toString() + '\n' + '\n' + "Description: " + description.getText().toString());

            /* Send it off to the Activity-Chooser */

                    startActivity(Intent.createChooser(email, (getString(R.string.EmailClient))));
                }
                else {
                    Toast toast = Toast.makeText(Feedback.this,(getString(R.string.AllFieldsCompulsory)), Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                    toast.show();
                             }
            }
        });


    }
}

