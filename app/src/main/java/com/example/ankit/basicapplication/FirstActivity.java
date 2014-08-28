package com.example.ankit.basicapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FirstActivity extends Activity {

    EditText etname;
    Button btntoast;
    Toast tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        etname = (EditText)findViewById(R.id.editText);
        btntoast = (Button) findViewById(R.id.btn);
        final Context cont = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;





        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etname.getText().toString();


                tt = Toast.makeText(cont, "Hello, "+name, duration);
                tt.show();

            }
        });


    }


}
