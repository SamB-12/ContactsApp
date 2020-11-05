package com.example.contactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> work = new ArrayList<>();
        work.add(new ContactModel("Boris Johnson","bojo@gov.uk","+448267951346",R.drawable.contact));
        work.add(new ContactModel("Rishi Sunak","rishi@gov.uk","+448825951346",R.drawable.contact));
        work.add(new ContactModel("Dominc Raab","raab@gov.uk","+448267982546",R.drawable.contact));
        work.add(new ContactModel("Preethi Patel","preethi@gov.uk","+448285282546",R.drawable.contact));
        work.add(new ContactModel("Michael Gove","gove@gov.uk","+448815282546",R.drawable.contact));
        work.add(new ContactModel("Robert Buckland","buckland@gov.uk","+448286242546",R.drawable.contact));
        work.add(new ContactModel("Ben Wallace","wallace@gov.uk","+448286852546",R.drawable.contact));
        work.add(new ContactModel("Matt Hancock","hancock@gov.uk","+448282852546",R.drawable.contact));
        work.add(new ContactModel("Alok Sharma","alok@gov.uk","+448285858546",R.drawable.contact));
        work.add(new ContactModel("Liz Truss","truss@gov.uk","+448285847546",R.drawable.contact));
        work.add(new ContactModel("Therese Coffey","coffey@gov.uk","+448285575546",R.drawable.contact));
        work.add(new ContactModel("Gavin Williamson","gavin@gov.uk","+448228582546",R.drawable.contact));
        work.add(new ContactModel("Geroge Eustice","geroge@gov.uk","+448285852546",R.drawable.contact));
        work.add(new ContactModel("Robert Jenerick","jenerick@gov.uk","+448285288746",R.drawable.contact));
        work.add(new ContactModel("Grant Shapps","grant@gov.uk","+448285872546",R.drawable.contact));
        work.add(new ContactModel("Brandon Lewis","brandon@gov.uk","+448285622546",R.drawable.contact));

        RecyclerView work_recyclerView = findViewById(R.id.RecyclerView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(this,work,R.color.work_color);
        work_recyclerView.setAdapter(contactAdapter);

    }




}