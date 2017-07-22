package com.app.softdrive.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);



        ArrayList<Usuario> userList=new ArrayList<>();
                userList.add(new Usuario("Pedro", "Sosa"));
                userList.add(new Usuario("Johan", "Otañez"));

        UsersAdapter adapter = new UsersAdapter(this, userList);
        ListView ListV =(ListView)findViewById(R.id.lista);
        ListV.setAdapter(adapter);

    }
}
