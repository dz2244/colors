package com.example.colors;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
public class MainActivity extends AppCompatActivity {
    Switch switch1;
    RadioButton rbRed, rbGreen ,rbBlue,rbWhite;
    Button btn;
    ConstraintLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews() {
        switch1 = findViewById(R.id.switch1);
        rbRed = findViewById(R.id.rbRed);
        rbGreen = findViewById(R.id.rbGreen);
        rbBlue = findViewById(R.id.rbBlue);
        rbWhite = findViewById(R.id.rbWhite);
        btn = findViewById(R.id.btn);
        background = findViewById(R.id.background);
    }
    public void clickedSwitch(View view) {}
    public void clickedRbRed(View view)
    {
        if(switch1.isChecked())
        {
            background.setBackgroundColor(Color.RED);
        }
    }
    public void clickedRbGreen(View view)
    {
        if(switch1.isChecked())
        {
            background.setBackgroundColor(Color.GREEN);
        }
    }
    public void clickedRbBlue(View view)
    {
        if(switch1.isChecked())
        {
            background.setBackgroundColor(Color.BLUE);
        }
    }
    public void clickedRbWhite(View view)
    {
        if(switch1.isChecked())
        {
            background.setBackgroundColor(Color.WHITE);
        }
    }
    public void clickedbtn(View view)
    {
        if(rbRed.isChecked())
        {
            background.setBackgroundColor(Color.RED);
        }
        else if(rbBlue.isChecked())
        {
            background.setBackgroundColor(Color.BLUE);
        }
        else if(rbGreen.isChecked())
        {
            background.setBackgroundColor(Color.GREEN);
        }
        else
        {
            background.setBackgroundColor(Color.WHITE);
        }
    }
}