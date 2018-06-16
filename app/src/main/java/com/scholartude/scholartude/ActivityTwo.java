package com.scholartude.scholartude;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public  class ActivityTwo extends AppCompatActivity {

    private Button bt;
    private TextView tv;
    private EditText editText1,editText2;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_two);

            Button bt=(Button) findViewById(R.id.bt1);
            TextView tv=(TextView) findViewById(R.id.tv1);
            EditText editText1=(EditText) findViewById(R.id.et1);
            EditText editText=(EditText) findViewById(R.id.et2);

            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(ActivityTwo.this, ForgetActivity.class);
                    startActivity(i);
                    finish();

                }
            });
        }

}
