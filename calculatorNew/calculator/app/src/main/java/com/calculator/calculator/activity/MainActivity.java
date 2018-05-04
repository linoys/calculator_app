package com.calculator.calculator.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.calculator.calculator.R;
import com.calculator.calculator.fregments.ScientificCalc;
import com.calculator.calculator.fregments.SimpleCalc;


public class MainActivity extends AppCompatActivity implements SimpleCalc.OnFragmentInteractionListener , ScientificCalc.OnFragmentInteractionListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fregment_container);

        if(fragment==null){
            fragment = new SimpleCalc();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fregment_container , fragment , "0").commit();

        }


    }


    public void LoadSecFragment(String name1, String st) {
        ScientificCalc secondFrg = new ScientificCalc ();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right , R.anim.enter_from_right , R.anim.exit_to_left);
        transaction.replace(R.id.fregment_container , secondFrg , (getSupportFragmentManager().getBackStackEntryCount()-1)+"").addToBackStack(null).commit();

    }

    public void GoBack() {

        Fragment f;
        getSupportFragmentManager().popBackStack();
        int num = getSupportFragmentManager().getBackStackEntryCount();
        f = getSupportFragmentManager().findFragmentByTag((num-1)+"");
        getSupportFragmentManager().beginTransaction().replace(R.id.fregment_container, f,(getSupportFragmentManager().getBackStackEntryCount()-1)+"").commit();
    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
