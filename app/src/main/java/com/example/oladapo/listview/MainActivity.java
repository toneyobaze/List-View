package com.example.oladapo.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> myFriends = new ArrayList<>();

        myFriends.add("Evans");
        myFriends.add("Jay");
        myFriends.add("Nick");
        myFriends.add("Theo");
        myFriends.add("Yemo");
        myFriends.add("Ellworth");
        myFriends.add("Adotey");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, myFriends);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Hello " + myFriends.get(position), Toast.LENGTH_LONG).show();

            }
        });
    }
}
