package com.scholartude.scholartude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText1,editText2,editText3;
    private Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1=(EditText) findViewById(R.id.edit_text1);
        EditText editText2=(EditText) findViewById(R.id.edit_text2);
        EditText editText3=(EditText) findViewById(R.id.edit_text3);
        Button button1=(Button)findViewById(R.id.button1);
        final Button button2=(Button)findViewById(R.id.button2);

    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });


    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
             Intent i = new Intent(MainActivity.this , ActivityTwo.class);
             startActivity(i);
             finish();
        }
    });
    }
}
