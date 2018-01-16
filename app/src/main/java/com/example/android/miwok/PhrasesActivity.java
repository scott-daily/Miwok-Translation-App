package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinna oyaase'na"));
        words.add(new Word("My name is...", "ayaaset"));
        words.add(new Word("How are you feeling?", "michaksas?"));
        words.add(new Word("I'm feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "aanas'aa?"));
        words.add(new Word("Yes, I'm coming.", "haa'aanam"));
        words.add(new Word("I'm coming.", "aanam"));
        words.add(new Word("Let's go.", "yoowutis"));
        words.add(new Word("Come here.", "anni'nem"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
