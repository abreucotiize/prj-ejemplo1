package com.app.softdrive.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button  linearV, linearH, relative, table, frame, list, grid, custom, style, auto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearV=(Button)findViewById(R.id.linearV);
        linearH=(Button)findViewById(R.id.linearH);
        relative=(Button)findViewById(R.id.relative);
        table=(Button)findViewById(R.id.table);
        frame=(Button)findViewById(R.id.frame);
        list=(Button)findViewById(R.id.List);
        grid=(Button)findViewById(R.id.grid);
        custom=(Button)findViewById(R.id.custom);
        style=(Button)findViewById(R.id.style);
        auto=(Button)findViewById(R.id.auto);

        linearV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LinearLayoutVertical.class);
                startActivity(intent);
            }
        });


        linearH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LinearLayoutHorizontal.class);
                startActivity(intent);
            }
        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,RelativeLayout.class);
                startActivity(intent);
            }
        });

        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent);
            }
        });

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FrameActivity.class);
                startActivity(intent);
            }
        });



        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });

        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, AdapterActivity.class);
                startActivity(intent);
            }
        });
        style.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, StyleActivity.class);
                startActivity(intent);
            }
        });

        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, AutoActivity.class);
                startActivity(intent);
            }
        });

    }
}

