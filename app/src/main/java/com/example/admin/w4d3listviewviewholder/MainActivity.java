package com.example.admin.w4d3listviewviewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ListView mListView;
    private SimpleAdapter adapter;
    private String[] names = new String[]{"Pepe", "Beto", "Raul", "Will"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listViewMain);
        adapter = new SimpleAdapter(this, names);
        mListView.setAdapter(adapter);
    }
}
