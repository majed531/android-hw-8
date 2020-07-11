package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      ArrayList<lakers> players = new ArrayList<>();

      lakers p3 = new lakers("kobe bryant",R.drawable.kobe,98);
      lakers p1 = new lakers("magic johnson",R.drawable.magic,99);
      lakers p2 = new lakers("big shaq",R.drawable.shaq,98);
      lakers p4 = new lakers("jerry west",R.drawable.jerry,97);
      lakers p5 = new lakers("kareem ",R.drawable.kareem,96);

      players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);

        RecyclerView rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
       lakersAdapter adapter = new lakersAdapter(players);
       rv.setAdapter(adapter);

   }
}