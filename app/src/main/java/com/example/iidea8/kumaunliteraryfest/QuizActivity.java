package com.example.iidea8.kumaunliteraryfest;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by Abhigyan on 7/22/2015.
 */
public class QuizActivity extends DrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.activity_frame);

        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_quiz, null, false);
        relativeLayout.addView(view);
    }

}
