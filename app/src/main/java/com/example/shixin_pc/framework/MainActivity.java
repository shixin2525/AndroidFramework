package com.example.shixin_pc.framework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mvc.controllor.MvcActivity;
import mvp.view.MvpActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mvcBtn=findViewById(R.id.btn_mvc);
        Button mvpBtn=findViewById(R.id.btn_mvp);
        mvcBtn.setOnClickListener(this);
        mvpBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_mvc:
                startActivity(new Intent(this,MvcActivity.class));
                break;
            case R.id.btn_mvp:
                startActivity(new Intent(this, MvpActivity.class));
                break;

        }
    }
}
