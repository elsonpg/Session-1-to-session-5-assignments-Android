package com.fortune.session5googlesearch;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class firstactivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstactivity);
        }

    public void onClick(View view)
    {
        EditText editText = (EditText)findViewById(R.id.Searchword);
        Intent intent= new Intent(this, secondactivity.class);
        intent.putExtra("text",editText.getText().toString());
        startActivity(intent);
    }
}
