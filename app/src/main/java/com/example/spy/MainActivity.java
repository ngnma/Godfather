package com.example.spy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText=findViewById(R.id.edit_txt);

        final EditText editText2=findViewById(R.id.edit_txt2);
        final Button start_btn=this.findViewById(R.id.start_btn);


        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //card.num_of_players=Integer.parseInt(editText.getText().toString());
                //card.num_of_spys=Integer.parseInt(editText2.getText().toString());
                final Intent intent=new Intent(getApplicationContext(),card.class);
                startActivity(intent);
            }
        });



    }



}
