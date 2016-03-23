package com.imagetest.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.imagetest.R;

/**
 * Created by Petkovski on 21.03.2016.
 */
public class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Base click listener
     */
    @Override
    public void onClick(View v) {
        //TODO
    }


    /**
     * Display a fragment without adding it to backStack
     *
     * @param fragment
     */
    protected void displayFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out, android.R.anim.fade_in, android.R.anim.fade_out);
        transaction.replace(R.id.main_container, fragment);

        transaction.commit();
    }
}
