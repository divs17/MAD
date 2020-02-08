package com.example.font;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final EditText et1=(EditText)findViewById(R.id.editText);
       final EditText et2=(EditText)findViewById(R.id.editText2);
       final Button bt=(Button)findViewById(R.id.button3);
       final TextView tv=(TextView)findViewById(R.id.textView6);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et2.getText().toString());

                int sum = i + j;
                tv.setText("The sum is " + sum);

            }

        });

    }

}


