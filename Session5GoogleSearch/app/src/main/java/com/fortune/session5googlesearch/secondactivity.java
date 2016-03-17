package com.fortune.session5googlesearch;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by Elson on 3/16/2016.
 */
public class secondactivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        Intent intent=getIntent();
        String action=intent.getAction();
        Uri data=intent.getData();
    }
}

