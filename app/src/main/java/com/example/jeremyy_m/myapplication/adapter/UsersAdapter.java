package com.example.jeremyy_m.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.jeremyy_m.myapplication.R;
import com.example.jeremyy_m.myapplication.classes.User;

import java.util.ArrayList;

/**
 * Created by jeremyy-m on 15/12/17.
 */

public class UsersAdapter extends ArrayAdapter<User> {

    public UsersAdapter(Context context, ArrayList<User> users){
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        return convertView;
    }
}
