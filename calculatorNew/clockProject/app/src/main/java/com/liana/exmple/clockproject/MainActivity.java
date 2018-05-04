package com.liana.exmple.clockproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ClientCircle circle ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       circle = (ClientCircle) findViewById(R.id.canvaspaint);

    }

    public void check(View view) {
        circle.check();

    }
}
