package com.shubhangi.optionmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.newfile,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.itm1)
            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
        if (id==R.id.itm2)
            Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
        if (id==R.id.itm3)
            Toast.makeText(this, "manu", Toast.LENGTH_SHORT).show();
        if (id==R.id.itm4)
            Toast.makeText(this, "profile", Toast.LENGTH_SHORT).show();
        return true;
    }
}
