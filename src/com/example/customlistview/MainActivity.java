package com.example.customlistview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends Activity {

	CountryModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<CountryModel> list = new ArrayList<CountryModel>();
        model=new CountryModel();
        model.setImage(R.drawable.flag_canada);
        model.setCountry("Canada");
        list.add(model);
        model=new CountryModel();
        model.setImage(R.drawable.flag_france);
        model.setCountry("France");
        list.add(model);
        model=new CountryModel();
        model.setImage(R.drawable.flag_india);
        model.setCountry("India");
        list.add(model);
        model=new CountryModel();
        model.setImage(R.drawable.flag_poland);
        model.setCountry("Poland");
        list.add(model);
        model=new CountryModel();
        model.setImage(R.drawable.flag_russia);
        model.setCountry("Russia");
        list.add(model);
        model=new CountryModel();
        model.setImage(R.drawable.flag_uk);
        model.setCountry("UK");
        list.add(model);
        model=new CountryModel();
        model.setImage(R.drawable.flag_usa);
        model.setCountry("Usa");
        list.add(model);
        
        ListView lv =(ListView)findViewById(R.id.listview);
        CountryAdapter adapter =new CountryAdapter(this, list);
        lv.setAdapter(adapter);
        
    }


   
}
