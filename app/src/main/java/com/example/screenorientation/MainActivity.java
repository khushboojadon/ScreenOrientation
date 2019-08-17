package com.example.screenorientation;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button plus,sub;
TextView number;
Integer i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findElementById();
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtract();
            }
        });
        if (savedInstanceState != null) {
            i = savedInstanceState.getInt("count");
            number.setText(String.valueOf(i));
        }
    }

    public void add()
    {
        i++;
        number.setText(String.valueOf(i));
    }
    public void subtract()
    {
        i--;
        number.setText(String.valueOf(i));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",i);
    }

    public void findElementById()
    {
        sub=findViewById(R.id.sub);
        plus=findViewById(R.id.plus);
        number=findViewById(R.id.number);
    }
}
