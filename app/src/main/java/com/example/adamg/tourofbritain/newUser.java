package com.example.adamg.tourofbritain;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by adamg on 21/03/2018.
 */

public class newUser extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newuser);
    }

    public void onClickBack(View v) {
        if (v.getId() == R.id.Bback) {
            finish();
        }
    }
}
