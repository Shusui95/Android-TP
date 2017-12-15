package com.example.jeremyy_m.myapplication.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jeremyy_m.myapplication.R;
import com.example.jeremyy_m.myapplication.classes.User;

public class ThirdActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        User user = getIntent().getExtras().getParcelable("user");
        TextView displayUser = (TextView) findViewById(R.id.displayUser);
        displayUser.setText("User :\n" +
                "First name : "+user.getFirstName()+"\n"+
                "Last name : "+user.getLastName()+"\n"+
                "Mail : "+user.getMail()+"\n"+
                "Birthday : "+user.getBirth_date()+"\n"
        );

    }

}
