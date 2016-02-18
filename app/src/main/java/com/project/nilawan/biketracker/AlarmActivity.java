package com.project.nilawan.biketracker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Nilawan on 18/2/2559.
 */
public class AlarmActivity extends Activity {

    private TextView text1, text2;
    private Button statusbike;
    private Button statusalarm;
    private Button Bback2;
    private Button bt_on;
    private Button bt_off;
    double motion;
    double alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
    }
}
