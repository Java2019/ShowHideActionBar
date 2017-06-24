package com.samples.home.showhideactionbar;

import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ShowHideActionBarActivity extends AppCompatActivity
        implements View.OnClickListener {

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hide_action_bar);
        actionBar = getSupportActionBar();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bHide:
                actionBar.hide();
                break;
            case R.id.bShow:
                actionBar.show();
                break;
        }
    }
}
