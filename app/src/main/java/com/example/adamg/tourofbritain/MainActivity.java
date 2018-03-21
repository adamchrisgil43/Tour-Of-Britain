package com.example.adamg.tourofbritain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void onClickLogin(View v){
        if(v.getId() == R.id.Blogin){
            Intent i = new Intent(MainActivity.this, menu.class);
            startActivity(i);
        }
    }

    public void onClickNewUser(View v){
        if(v.getId() == R.id.Bnewuser){
            Intent i = new Intent(this, newUser.class);
            startActivity(i);
        }
    }

}
