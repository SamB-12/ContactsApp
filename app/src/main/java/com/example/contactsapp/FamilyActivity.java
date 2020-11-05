package com.example.contactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> family = new ArrayList<>();
        family.add(new ContactModel("Elizabeth","lizzie@gov.uk","+449485897621",R.drawable.contact));
        family.add(new ContactModel("Philip","philip@gov.uk","+449484897621",R.drawable.contact));
        family.add(new ContactModel("Charles","charles@gov.uk","+449454697621",R.drawable.contact));
        family.add(new ContactModel("William","william@gov.uk","+449484234621",R.drawable.contact));
        family.add(new ContactModel("George","george@gov.uk","+449487897621",R.drawable.contact));
        family.add(new ContactModel("Charlotte","charlotte@gov.uk","+449484896781",R.drawable.contact));
        family.add(new ContactModel("Louis","louis@gov.uk","+449497297621",R.drawable.contact));
        family.add(new ContactModel("Harry","harry@gov.uk","+449452147621",R.drawable.contact));
        family.add(new ContactModel("Archie","archie@gov.uk","+449488961621",R.drawable.contact));
        family.add(new ContactModel("Andrew","andrew@gov.uk","+449484597821",R.drawable.contact));
        family.add(new ContactModel("Beatrice","beatrice@gov.uk","+449469777621",R.drawable.contact));
        family.add(new ContactModel("Eugenie","eugenie@gov.uk","+449484672121",R.drawable.contact));
        family.add(new ContactModel("Edward","edward@gov.uk","+449488957621",R.drawable.contact));
        family.add(new ContactModel("James","james@gov.uk","+449681297621",R.drawable.contact));
        family.add(new ContactModel("Louise","louise@gov.uk","+449462177621",R.drawable.contact));

        RecyclerView family_recyclerView = findViewById(R.id.RecyclerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(this,family,R.color.family_color);
        family_recyclerView.setAdapter(contactAdapter);
    }


}