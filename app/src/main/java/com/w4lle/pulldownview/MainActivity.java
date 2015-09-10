package com.w4lle.pulldownview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.image).setOnClickListener(this);

        findViewById(R.id.text7).setOnClickListener(this);
        findViewById(R.id.text8).setOnClickListener(this);
        findViewById(R.id.text9).setOnClickListener(this);
        findViewById(R.id.text10).setOnClickListener(this);
        findViewById(R.id.text11).setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        if (view instanceof TextView) {
            Toast.makeText(this, ((TextView) view).getText().toString(), Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == R.id.image) {
            Toast.makeText(this, "image onClick" ,Toast.LENGTH_SHORT).show();
        }
    }
}
