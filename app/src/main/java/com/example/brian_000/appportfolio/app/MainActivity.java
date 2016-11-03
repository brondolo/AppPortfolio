package com.example.brian_000.appportfolio.app;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPopularMovies(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my Popular Movies project", Toast.LENGTH_LONG).show();
    }

    public void onClickStockHawk(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my Stock Hawk project", Toast.LENGTH_LONG).show();
    }

    public void onClickBuildBigger(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my Build It Bigger project", Toast.LENGTH_LONG).show();
    }

    public void onClickMakeAppMaterial(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my Make Your App Material project", Toast.LENGTH_LONG).show();
    }

    public void onClickGoUbiquitous(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my Go Ubiquitous project", Toast.LENGTH_LONG).show();
    }

    public void onClickCapstone(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my Capstone project", Toast.LENGTH_LONG).show();
    }
}
