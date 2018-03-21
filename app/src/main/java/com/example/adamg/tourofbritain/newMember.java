package com.example.adamg.tourofbritain;
/*This Activity is for new TOB members*/


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by adamg on 21/03/2018.
 */

public class newMember extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newmember);
    }

    public void onClickBack(View v){
        if (v.getId() == R.id.Bback) {
            finish();
        }
    }
}
