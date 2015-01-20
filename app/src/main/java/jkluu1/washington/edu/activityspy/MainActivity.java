package jkluu1.washington.edu.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final String logTag = "MyLogs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i(logTag, "onCreate() event fired");
        TextView textElement = (TextView) findViewById(R.id.onCreateHello);
        textElement.setText(R.string.greetings); //leave this line to assign a string resource

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(logTag, "onStart() event fired");
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(logTag, "onResume() event fired");
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(logTag, "onPause() event fired");
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(logTag, "onStop() event fired");
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(logTag, "onDestroy() event fired");
        Log.e(logTag, "We're doing down captain!");

        // The activity is about to be destroyed.
    }




/*
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

*/
}
