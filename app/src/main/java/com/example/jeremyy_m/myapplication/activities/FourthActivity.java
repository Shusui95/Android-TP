package com.example.jeremyy_m.myapplication.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jeremyy_m.myapplication.R;
import com.example.jeremyy_m.myapplication.adapter.UsersAdapter;
import com.example.jeremyy_m.myapplication.classes.User;

import java.util.ArrayList;

/**
 * Created by jeremyy-m on 15/12/17.
 */

public class FourthActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<User> usersList = new ArrayList<>();
        UsersAdapter adapter = new UsersAdapter(this, usersList);
        ListView listView = (ListView) findViewById(R.id.listview);
    }
}
