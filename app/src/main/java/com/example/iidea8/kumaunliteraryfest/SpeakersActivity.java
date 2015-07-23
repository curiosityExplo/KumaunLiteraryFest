package com.example.iidea8.kumaunliteraryfest;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by Abhigyan on 7/21/2015.
 */
public class SpeakersActivity extends DrawerActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.activity_frame);

        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_speakers, null, false);
        relativeLayout.addView(view);
    }
}
