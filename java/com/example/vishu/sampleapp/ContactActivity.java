package com.example.vishu.sampleapp;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.widget.ListView;
import android.widget.Toast;

public class ContactActivity extends PreferenceActivity implements Preference.OnPreferenceChangeListener{

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_contact);
        Toast.makeText(this,"Here im in contact activity",Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object o) {
        return false;
    }
}
