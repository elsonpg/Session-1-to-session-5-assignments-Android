package com.acadgild.customlistview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.marcodinacci.demos.alv.R;

public class ListViewActivity extends Activity {

    ListView lv;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        lv=(ListView)findViewById(R.id.list);
        
        Context ctx = getApplicationContext();
		Resources res = ctx.getResources();

		String[] options = res.getStringArray(R.array.country_names);
		TypedArray icons = res.obtainTypedArray(R.array.country_icons);

        lv.setAdapter(new ImageAndTextAdapter(ctx, R.layout.list_item_row,
                options, icons));

        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView tv = (TextView)view.findViewById(R.id.option_text);
                Toast.makeText(getApplicationContext(),tv.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}