package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private final int NO_IMAGE = 0;
    MediaPlayer mediaPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // we're going to create an array to hold the number words
        final ArrayList<Word> words = new ArrayList<Word>();

        // now we'll fill in the array
        words.add(new Word("Where are you going?", "minto wuksus", NO_IMAGE, R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinnә oyaase'nә", NO_IMAGE, R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaaset..", NO_IMAGE, R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michәksәs?", NO_IMAGE, R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "kuchi achit", NO_IMAGE, R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "әәnәs'aa?", NO_IMAGE, R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", NO_IMAGE, R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.", "әәnәm", NO_IMAGE, R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.", "yoowutis", NO_IMAGE, R.raw.phrase_lets_go));
        words.add(new Word("Come here.", "әnni'nem", NO_IMAGE, R.raw.phrase_come_here));


        // create a wordadapter whose data source is the arraylist of type Word
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        // get a reference to the listview and add the adapter to the listview
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        //set an onclicklistener...
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                playAudioFile(words.get(position).getRawAudioResourceID());
                Log.v("PhrasesActivity", "Current Word" + words.get(position));

            }
        });

    }


    private void playAudioFile(int audioFileID) {

        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, audioFileID);
        mediaPlayer.start();

        //mediaplayer oncompletion listener
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
                mediaPlayer = null;

            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }


}

