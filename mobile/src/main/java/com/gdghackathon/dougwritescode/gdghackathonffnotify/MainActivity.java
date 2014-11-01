package com.gdghackathon.dougwritescode.gdghackathonffnotify;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends Activity {

    static final String PLAYERS = "saved players";
    WeatherGrabber weathergrabber = new WeatherGrabber();
    FFDataGrabber ffdatagrabber = new FFDataGrabber();
    ArrayList<String> savedplayers = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.savedplayers = savedInstanceState.getStringArrayList(PLAYERS);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_main, menu); // for now
        return true;
    }
    /*
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
    */ // for now

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putStringArrayList(PLAYERS, savedplayers);
        super.onSaveInstanceState(savedInstanceState);
    }
}
