package isbhv2.hi.notandi.skater.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import isbhv2.hi.notandi.skater.R;

public class FindSpotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_spot);

        final EditText searchInputString = (EditText) findViewById(R.id.searchInput);
    }


}