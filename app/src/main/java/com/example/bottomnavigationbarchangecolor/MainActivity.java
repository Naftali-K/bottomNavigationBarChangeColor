package com.example.bottomnavigationbarchangecolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bottomAppBarBtn, bottomBarMadeViewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setReferences();

        bottomAppBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(new Intent(getBaseContext(), BottomAppBarActivity.class));
            }
        });

        bottomBarMadeViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(new Intent(getBaseContext(), BottomBarMadeViewActivity.class));
            }
        });
    }

    private void setReferences(){
        bottomAppBarBtn = findViewById(R.id.bottom_app_bar_btn);
        bottomBarMadeViewBtn = findViewById(R.id.bottom_bar_made_view_btn);
    }

    private void openActivity(Intent intent){
        startActivity(intent);
    }
}