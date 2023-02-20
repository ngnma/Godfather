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
    static HashMap<Integer,String> role_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        //roles= new String[]{"ساول گودمن","ماتادور","دکتر واتسون","شهروند ساده","نوستراداموس","کنستانتین","لیون","همشهری کین","پدرخوانده","مافیا ساده"};
        src_roles = new int[]{R.drawable.doctor,R.drawable.godfather,R.drawable.good,R.drawable.kein,R.drawable.konstantin,R.drawable.leon,R.drawable.mafia,R.drawable.matador,R.drawable.nostradamous,R.drawable.shahr};
        role_map = new HashMap<Integer,String>();
        role_map.put(R.drawable.doctor,"negin");
        role_map.put(R.drawable.godfather,"narges");
        role_map.put(R.drawable.good,"rasoul");
        role_map.put(R.drawable.kein,"moslem");
        role_map.put(R.drawable.konstantin,"nafise");
        role_map.put(R.drawable.leon,"samira");
        role_map.put(R.drawable.mafia,"amir");
        role_map.put(R.drawable.matador,"nooshin");
        role_map.put(R.drawable.nostradamous,"hamed");
        role_map.put(R.drawable.shahr,"elahe");

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

//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                name.foc(false);
//            }
//        });
    }

}
