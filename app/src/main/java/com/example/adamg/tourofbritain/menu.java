package com.example.adamg.tourofbritain;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by adamg on 21/03/2018.
 */

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void onClickNew(View v){
        if(v.getId() == R.id.Bnewmember){
            Intent i = new Intent(this, newMember.class);
            startActivity(i);
        }
    }

    public void onClickEdit(View v){
        if(v.getId() == R.id.Beditmember){
            Intent i = new Intent(this, editMember.class);
            startActivity(i);
        }
    }

    public void onClickView(View v){
        if(v.getId() == R.id.Bviewmembers){
            Intent i = new Intent(this, viewMembers.class);
            startActivity(i);
        }
    }

    public void onClickBack(View v){
        if (v.getId() == R.id.Bback) {
            finish();
        }
    }

}
