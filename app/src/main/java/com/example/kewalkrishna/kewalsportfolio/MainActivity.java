package com.example.kewalkrishna.kewalsportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button clickSpotify = (Button)findViewById(R.id.button_spotify);
        clickSpotify.setOnClickListener((View.OnClickListener) this);

        Button clickScore = (Button)findViewById(R.id.button_scores);
        clickScore.setOnClickListener((View.OnClickListener) this);

        Button clickLibrary = (Button)findViewById(R.id.button_library);
        clickLibrary.setOnClickListener((View.OnClickListener) this);

        Button clickBuild = (Button)findViewById(R.id.button_build);
        clickBuild.setOnClickListener((View.OnClickListener) this);

        Button clickReader = (Button)findViewById(R.id.button_reader);
        clickReader.setOnClickListener((View.OnClickListener) this);

        Button clickCapstone1 = (Button)findViewById(R.id.button_capstone1);
        clickCapstone1.setOnClickListener((View.OnClickListener) this);

        Button clickCapstone2 = (Button)findViewById(R.id.button_capstone2);
        clickCapstone2.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void onClick(View v) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Button b = (Button)v;
        String text = b.getText().toString();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
