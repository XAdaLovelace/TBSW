package com.example.user.tbsw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton TB;
    Switch SW;
    LinearLayout LY;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TB = (ToggleButton)findViewById(R.id.tglB);
        SW = (Switch)findViewById(R.id.Sw);
        LY = (LinearLayout)findViewById(R.id.LY);
        btn = (Button)findViewById(R.id.btn);
    }

    public void BlueWhite(View view){

        if(TB.isChecked()) {

            LY.setBackgroundResource(R.drawable.blue);
        }
        else{

            LY.setBackgroundResource(R.drawable.white);
        }


    }

    public void YellowRed(View view){

        if(SW.isChecked()){

            LY.setBackgroundResource(R.drawable.yellow);

        }
        else{
            LY.setBackgroundResource(R.drawable.red);
        }
    }

    public void toast1(View view){
        if(TB.isChecked() && SW.isChecked()) {
            Toast.makeText(this, "Toggle ON, Switch ON", Toast.LENGTH_LONG).show();
        }
            else if (!TB.isChecked() && !SW.isChecked()) {
                Toast.makeText(this, "Toggle OFF, Switch OFF", Toast.LENGTH_LONG).show();
            }
            else if(!TB.isChecked() && SW.isChecked()){
            Toast.makeText(this, "Toggle OFF, Switch ON", Toast.LENGTH_LONG).show();
        }
            else if(TB.isChecked() && !SW.isChecked()){
            Toast.makeText(this, "Toggle ON, Switch OFF", Toast.LENGTH_LONG).show();
        }

    }
}
