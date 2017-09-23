package com.pradeep.calibration.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import io.rpng.calibration.R;
import com.pradeep.calibration.R;

/******************************************************************************************************
 * Activity for selecting the camera Calibretion reconstruction activity
 */
public class Main_screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_);

        Button recButton = (Button)findViewById(R.id.rec_button);

        Button caliButton = (Button)findViewById(R.id.cali_button);

/****************************************************************************************************
 * reconstruction activity activity is selected when button is pressed
 */
        recButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View v){
                Intent int1 = new Intent(Main_screen_Activity.this,ReconstructionActivity.class);
                startActivity(int1);
            }
        });
/************************************************************************************************
 * camera calibration activity is selected when button is pressed
 */
        caliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(Main_screen_Activity.this, MainActivity.class);
                startActivity(int2);
            }
        });
    }
}
