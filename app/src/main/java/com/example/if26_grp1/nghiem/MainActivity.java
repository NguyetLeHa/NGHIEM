package com.example.if26_grp1.nghiem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    /** methode onCreate quand il commence*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx =(TextView) findViewById(R.id.message);
        tx.setText("Bonjour IF26");
    }
}
