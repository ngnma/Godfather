package com.example.spy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import java.util.HashMap;



public class Night extends AppCompatActivity {
    static HashMap<Integer,String> role_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night);
        role_map = new HashMap<Integer,String>();
        role_map.put(R.id.ndoctor,"negin");
        role_map.put(R.id.ngodfather,"narges");
        role_map.put(R.id.ngood,"rasoul");
        role_map.put(R.id.nkein,"moslem");
        role_map.put(R.id.nkonstantin,"nafise");
        role_map.put(R.id.nleon,"samira");
//        role_map.put(R.id.nmafia,"amir");
//        role_map.put(R.id.nmatador,"nooshin");
//        role_map.put(R.id.nnostradamous,"hamed");
//        role_map.put(R.id.nshahr,"elahe");


        final Button ndoctor = this.findViewById(R.id.ndoctor);
        final Button ngodfather = this.findViewById(R.id.ngodfather);
        final Button nkein = this.findViewById(R.id.nkein);
        final Button ngood = this.findViewById(R.id.ngood);
        final Button nkonstantin = this.findViewById(R.id.nkonstantin);
        final Button nleon = this.findViewById(R.id.nleon);

        ndoctor.setText(role_map.get(R.id.ndoctor)+"\n\n doctor");
        ngodfather.setText(role_map.get(R.id.ngodfather)+"\n\n godfather");
        ngood.setText(role_map.get(R.id.ngood)+"\n\n goodman");
        nleon.setText(role_map.get(R.id.nleon)+"\n\n leon");
        nkonstantin.setText(role_map.get(R.id.nkonstantin)+"\n\n konstantin");
        nkein.setText(role_map.get(R.id.nkein)+"\n\n kein");


        ngodfather.setBackgroundColor(Color.GREEN);
        AlertDialog order = new AlertDialog()
    }


}
