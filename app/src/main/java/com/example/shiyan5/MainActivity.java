package com.example.shiyan5;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static final int menu_setting = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        FragmentPreferences fragmentPreference=new FragmentPreferences();

        transaction.replace(android.R.id.content,fragmentPreference);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    //@Override
    public boolean onCreateOptionMenu(final Menu menu)
    {
        menu.add(0,menu_setting,1,"设置");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(final MenuItem item)
    {
        return true;
    }
}
