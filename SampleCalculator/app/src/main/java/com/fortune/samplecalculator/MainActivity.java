package com.fortune.samplecalculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    Button BTONE,BTTWO,BTTHREE,BTFOUR,BTFIVE,BTSIX,BTSEVEN,BTEIGHT,BTNINE,BTZERO,BTEQUAL,BTDOT,BTCLEAR,BTADD,BTSUB,BTMUL,BTDIV,BTMOD,BTSQRT,BTDEL;
    EditText ETN;
    private double NUM1,NUM2,RESULT;
    static double SQRT;
    String str;
    private boolean FLAGADD=false,FLAGSUB=false,FLAGMUL=false,FLAGDIV=false,FLAGMOD=false,FLAGSQRT=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ETN=(EditText)findViewById(R.id.editText);
        BTONE=(Button)findViewById(R.id.button11);
        BTTWO=(Button)findViewById(R.id.button12);
        BTTHREE=(Button)findViewById(R.id.button13);
        BTFOUR=(Button)findViewById(R.id.button6);
        BTFIVE=(Button)findViewById(R.id.button7);
        BTSIX=(Button)findViewById(R.id.button8);
        BTSEVEN=(Button)findViewById(R.id.button);
        BTEIGHT=(Button)findViewById(R.id.button2);
        BTNINE=(Button)findViewById(R.id.button9);
        BTZERO=(Button)findViewById(R.id.button16);
        BTEQUAL=(Button)findViewById(R.id.button20);
        BTDOT=(Button)findViewById(R.id.button17);
        BTCLEAR=(Button)findViewById(R.id.button10);
        BTADD=(Button)findViewById(R.id.button4);
        BTSUB=(Button)findViewById(R.id.button9);
        BTMUL=(Button)findViewById(R.id.button14);
        BTDIV=(Button)findViewById(R.id.button19);
        BTMOD=(Button)findViewById(R.id.button15);
        BTSQRT=(Button)findViewById(R.id.button18);
        BTDEL=(Button)findViewById(R.id.button10);
        ETN.setText("0");

        BTONE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTONE.getText().toString());
            }
        });
        BTTWO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTTWO.getText().toString());
            }
        });
        BTTHREE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTTHREE.getText().toString());
            }
        });
        BTFOUR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTFOUR.getText().toString());
            }
        });
        BTFIVE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTFIVE.getText().toString());
            }
        });
        BTSIX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTSIX.getText().toString());
            }
        });
        BTSEVEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTSEVEN.getText().toString());
            }
        });
        BTEIGHT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTEIGHT.getText().toString());
            }
        });
        BTNINE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTNINE.getText().toString());
            }
        });
        BTZERO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTZERO.getText().toString());
            }
        });
        BTEQUAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTEQUAL.getText().toString());
            }
        });
        BTDOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTDOT.getText().toString());
            }
        });
        BTCLEAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ETN.append(BTCLEAR.getText().toString());
            }
        });
        BTADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FLAGADD=true;
                NUM1=Double.parseDouble(ETN.getText().toString());
                ETN.setText("");
            }
        });
        BTSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FLAGSUB=true;
                NUM1=Double.parseDouble(ETN.getText().toString());
                ETN.setText("");
            }
        });
        BTMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FLAGMUL=true;
                NUM1=Double.parseDouble(ETN.getText().toString());
                ETN.setText("");
            }
        });
        BTDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FLAGDIV=true;
                NUM1=Double.parseDouble(ETN.getText().toString());
                ETN.setText("");
            }
        });
        BTMOD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FLAGMOD=true;
                NUM1=Double.parseDouble(ETN.getText().toString());
                ETN.setText("");
            }
        });
        BTSQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FLAGSQRT=true;
                NUM1=Double.parseDouble(ETN.getText().toString());
                ETN.setText("");
            }
        });
        BTEQUAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM2=Double.parseDouble(ETN.getText().toString());
                if(FLAGADD){
                    RESULT=NUM1+NUM2;
                    FLAGADD=false;
                }
                if(FLAGSUB){
                    RESULT=NUM1-NUM2;
                    FLAGSUB=false;
                }
                if(FLAGMUL){
                    RESULT=NUM1*NUM2;
                    FLAGMUL=false;
                }
                if(FLAGDIV){
                    RESULT=NUM1/NUM2;
                    FLAGDIV=false;
                }
                if(FLAGMOD){
                    RESULT=NUM1%NUM2;
                    FLAGMOD=false;
                }
                ETN.setText(""+RESULT);
            }
        });

        BTCLEAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ETN.setText("0");
            }
        });
        BTDEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=ETN.getText().toString();
                str=str.replace(str.substring(str.length()-1),"");
                ETN.setText(str);
            }
        });

    }
}
