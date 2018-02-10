package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // we're going to create an array to hold the number words
        ArrayList<Word> words = new ArrayList<Word>();

        // now we'll fill in the array
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "ṭakaakki"));
        words.add(new Word("gray", "ṭopoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));


        // create a wordadapter whose data source is the arraylist of type Word
        WordAdapter adapter = new WordAdapter(this, words);

        // get a reference to the listview and add the adapter to the listview
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }

}
