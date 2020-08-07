package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewRed;
    private TextView mTextViewOrange;
    private TextView mTextViewYellow;
    private TextView mTextViewGreen;
    private TextView mTextViewBlue;
    private TextView mTextViewIndigo;
    private TextView mTextViewViolet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setListeners();
    }

    private void findViews() {
        mTextViewRed = findViewById(R.id.txt_view_red);
        mTextViewOrange = findViewById(R.id.txt_view_orange);
        mTextViewYellow = findViewById(R.id.txt_view_yellow);
        mTextViewGreen = findViewById(R.id.txt_view_green);
        mTextViewBlue = findViewById(R.id.txt_view_blue);
        mTextViewIndigo = findViewById(R.id.txt_view_indigo);
        mTextViewViolet = findViewById(R.id.txt_view_violet);
    }


    private void setListeners() {

        mTextViewRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changeMode(mTextViewRed, "#FF0000");
            }
        });

        mTextViewOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changeMode(mTextViewOrange, "#FF9800");
            }
        });

        mTextViewYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changeMode(mTextViewYellow, "#FAEE11");
            }
        });

        mTextViewGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changeMode(mTextViewGreen, "#4FF409");
            }
        });

        mTextViewBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changeMode(mTextViewBlue, "#425EFB");
            }
        });

        mTextViewIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changeMode(mTextViewIndigo, "#651291");
            }
        });

        mTextViewViolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                changeMode(mTextViewViolet, "#EB7EF3");
            }
        });
    }

    private void changeMode(TextView textView, String color) {

        resetTextViews();
        textView.setVisibility(View.GONE);
        setTextColor(color);

        textView.postDelayed(new Runnable() {
            @Override
            public void run() {
                resetColors();
            }
        }, 5000);
    }

    private void resetTextViews() {

        mTextViewRed.setVisibility(View.VISIBLE);
        mTextViewOrange.setVisibility(View.VISIBLE);
        mTextViewYellow.setVisibility(View.VISIBLE);
        mTextViewGreen.setVisibility(View.VISIBLE);
        mTextViewBlue.setVisibility(View.VISIBLE);
        mTextViewIndigo.setVisibility(View.VISIBLE);
        mTextViewViolet.setVisibility(View.VISIBLE);
    }

    private void setTextColor(String color) {
        mTextViewRed.setTextColor(Color.parseColor(color));
        mTextViewOrange.setTextColor(Color.parseColor(color));
        mTextViewYellow.setTextColor(Color.parseColor(color));
        mTextViewGreen.setTextColor(Color.parseColor(color));
        mTextViewBlue.setTextColor(Color.parseColor(color));
        mTextViewIndigo.setTextColor(Color.parseColor(color));
        mTextViewViolet.setTextColor(Color.parseColor(color));
    }

    private void resetColors() {
        resetTextViews();
        mTextViewRed.setTextColor(Color.parseColor("#000000"));
        mTextViewOrange.setTextColor(Color.parseColor("#000000"));
        mTextViewYellow.setTextColor(Color.parseColor("#000000"));
        mTextViewGreen.setTextColor(Color.parseColor("#000000"));
        mTextViewBlue.setTextColor(Color.parseColor("#ffffff"));
        mTextViewIndigo.setTextColor(Color.parseColor("#ffffff"));
        mTextViewViolet.setTextColor(Color.parseColor("#000000"));
    }

}