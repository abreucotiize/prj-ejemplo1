package com.app.softdrive.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        String[] data={"corolla", "camry", "civiv", "accord","lancer", "crv", "skyline", "trueno", "RX-7"};
        AutoCompleteTextView autoC=(AutoCompleteTextView)findViewById(R.id.auto);
        autoC.setAdapter(new ArrayAdapter<>(this, android.R.layout.select_dialog_item, data));
        autoC.setThreshold(1);
    }
}
