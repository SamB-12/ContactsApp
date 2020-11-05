package com.example.contactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> friends = new ArrayList<>();
        friends.add(new ContactModel("Kepa Arizzabalaga","kepa@chelsea.co.uk","+448136458792",R.drawable.contact));
        friends.add(new ContactModel("Antonio Rudiger","rudi@chelsea.co.uk","+448138548792",R.drawable.contact));
        friends.add(new ContactModel("Marcos Alanso","alanso@chelsea.co.uk","+448136458872",R.drawable.contact));
        friends.add(new ContactModel("Jorghino","jorghino@chelsea.co.uk","+448136458892",R.drawable.contact));
        friends.add(new ContactModel("Thiago Silva","silva@chelsea.co.uk","+448136457792",R.drawable.contact));
        friends.add(new ContactModel("N'Golo Kante","kante@chelsea.co.uk","+448136455892",R.drawable.contact));
        friends.add(new ContactModel("Ross Barkley","barkley@chelsea.co.uk","+448136548792",R.drawable.contact));
        friends.add(new ContactModel("Tammy Abraham","tammy@chelsea.co.uk","+448136458972",R.drawable.contact));
        friends.add(new ContactModel("Christain Pulisic","puli@chelsea.co.uk","+448136478792",R.drawable.contact));
        friends.add(new ContactModel("Timo Werner","werner@chelsea.co.uk","+448136458787",R.drawable.contact));
        friends.add(new ContactModel("Willy Caballero","willy@chelsea.co.uk","+448136455892",R.drawable.contact));
        friends.add(new ContactModel("Eduardo Mendy","mendy@chelsea.co.uk","+448136458987",R.drawable.contact));
        friends.add(new ContactModel("Oliver Giroud","giroud@chelsea.co.uk","+448134658792",R.drawable.contact));
        friends.add(new ContactModel("Mason Mount","kepa@chelsea.co.uk","+448136485792",R.drawable.contact));
        friends.add(new ContactModel("Ben Chilwell","chilwell@chelsea.co.uk","+448136457892",R.drawable.contact));
        friends.add(new ContactModel("Kai Havertz","kai@chelsea.co.uk","+448135878792",R.drawable.contact));

        RecyclerView friends_recyclerView = findViewById(R.id.RecyclerView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(this,friends,R.color.friends_color);
        friends_recyclerView.setAdapter(contactAdapter);
    }
}