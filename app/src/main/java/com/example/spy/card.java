package com.example.spy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;

public class card extends AppCompatActivity {
    public static int num_of_players=10;
    int counter=0;
    boolean show_word=true;
    int[] src_roles;
    static HashMap<String, Integer> role_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        //roles= new String[]{"ساول گودمن","ماتادور","دکتر واتسون","شهروند ساده","نوستراداموس","کنستانتین","لیون","همشهری کین","پدرخوانده","مافیا ساده"};
        src_roles = new int[]{R.drawable.doctor,R.drawable.godfather,R.drawable.good,R.drawable.kein,R.drawable.konstantin,R.drawable.leon,R.drawable.mafia,R.drawable.matador,R.drawable.nostradamous,R.drawable.shahr};
        role_map = new HashMap<String, Integer>();
        role_map.put("NEGIN",R.drawable.doctor);
        role_map.put("NARGES",R.drawable.godfather);
        role_map.put("LJN",R.drawable.good);
        role_map.put("AKS",R.drawable.kein);
        role_map.put("ASJHCBJ",R.drawable.konstantin);
        role_map.put("KAJSNC",R.drawable.leon);
        role_map.put("KNJ",R.drawable.mafia);
        role_map.put("ALKCSN",R.drawable.matador);
        role_map.put("uoih",R.drawable.nostradamous);
        role_map.put("res",R.drawable.shahr);

        final EditText name=this.findViewById(R.id.name);
        final ConstraintLayout back=findViewById(R.id.back);
        final ImageView imageView=this.findViewById(R.id.card_role);
        final Button next_btn=this.findViewById(R.id.next_btn);
        name.setVisibility(View.GONE);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter==num_of_players+1){
                    imageView.setImageResource(R.drawable.start_game);
                }else{
                    if(show_word){
                        name.setVisibility(View.VISIBLE);
                        imageView.setImageResource(src_roles[counter]);
                        counter++;
                    }else {
                        name.setVisibility(View.GONE);
                        imageView.setImageResource(R.drawable.spy);
                    }
                    show_word=!show_word;
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.foc(false);
            }
        });
    }

}
