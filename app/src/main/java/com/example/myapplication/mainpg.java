package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mainpg extends AppCompatActivity {

    private TextView more;
    private TextView profile;
    private TextView cart;
    private TextView post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpg);

        TextView more = (TextView) findViewById(R.id.sidebar);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openthreedot();
            }
        });
        TextView profile = (TextView) findViewById(R.id.personal);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpersonal();
            }
        });
        TextView cart = (TextView) findViewById(R.id.iconshop);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openshopicon();
            }
        });
        TextView post = (TextView) findViewById(R.id.iconadd);
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpost();
            }
        });

    }
    public void openthreedot() {
        Intent intent = new Intent(this,threedoticon.class);
        startActivity(intent);
    }
    public void openpersonal() {
        Intent intent = new Intent(this,personalinfo.class);
        startActivity(intent);
    }
    public void openshopicon() {
        Intent intent = new Intent(this,shop.class);
        startActivity(intent);
    }
    public void openpost() {
        Intent intent = new Intent(this,add.class);
        startActivity(intent);
    }
}