package com.example.jeremyy_m.myapplication.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jeremyy_m.myapplication.R;
import com.example.jeremyy_m.myapplication.classes.User;

public class SecondActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button connectBtn = (Button) findViewById(R.id.buttonClickSave);
        connectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User("Kane", "Borris", "boris.kane@mail.uk", "23-06-1987");
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("user", user);
                startActivity(intent);
            }
        });
    }

}
