package com.fortune.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    EditText et_data;
    Button bt_display;
    TextView tv_displayText;
    CheckBox cd_displaytoast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_data=(EditText)findViewById(R.id.editText);
        bt_display=(Button)findViewById(R.id.button);
        tv_displayText=(TextView)findViewById(R.id.textView);
        cd_displaytoast=(CheckBox)findViewById(R.id.checkBox);

        bt_display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message=et_data.getText().toString();
                tv_displayText.setText("Message is:"+message);

                if(cd_displaytoast.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Message is:"+ message, Toast.LENGTH_LONG).show();
                }

                    cd_displaytoast.setChecked(false);
            }
        });

    }
}
