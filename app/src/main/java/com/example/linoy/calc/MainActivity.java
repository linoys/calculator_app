package com.example.linoy.calc;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class
MainActivity extends AppCompatActivity implements firsstCalc.FirstOnFragmentInteractionListener, secondCalc.SecondFragmentInteractionListener
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fregment_container);

        if (fragment == null) {

            fragment = new firsstCalc();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fregment_container, fragment, "0").commit();
        }
    }

    public void LoadSecFragment()
    {
        secondCalc secondFregment = new secondCalc();


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        transaction.replace(R.id.fregment_container, secondFregment,(getSupportFragmentManager().getBackStackEntryCount()-1)+"").addToBackStack(null).commit();

    }
    public void GoBack(){

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
