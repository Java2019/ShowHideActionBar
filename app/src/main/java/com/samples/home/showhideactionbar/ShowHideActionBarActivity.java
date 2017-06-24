package com.samples.home.showhideactionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ShowHideActionBarActivity extends Activity implements View.OnClickListener {

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hide_action_bar);
        actionBar = getActionBar();
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
