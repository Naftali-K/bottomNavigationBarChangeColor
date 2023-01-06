package com.example.bottomnavigationbarchangecolor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomAppBarActivity extends AppCompatActivity {

    private BottomAppBar bottomAppBar;
    private BottomNavigationView bottomNavView;
    private FloatingActionButton upload_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_app_bar);
        setReferences();

        bottomNavView.setBackground(null);

        bottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home_btn:
                        changeBarColor(R.color.blue);
                        break;
                    case R.id.search_btn:
                        changeBarColor(R.color.teal_700);
                        break;
                    case R.id.notification_btn:
                        changeBarColor(R.color.purple_500);
                        break;
                    case R.id.profile_btn:
                        changeBarColor(R.color.red);
                        break;
                    default:
                        Toast.makeText(getBaseContext(), "Error! Wrong Action!", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });

        upload_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Upload new content.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setReferences(){
        bottomAppBar = findViewById(R.id.bottom_app_bar);
        bottomNavView = findViewById(R.id.bottom_nav_view);
        upload_btn = findViewById(R.id.upload_btn);
    }

    private void changeBarColor(int color){
        bottomAppBar.setBackgroundTint(ColorStateList.valueOf(getColor(color)));
    }
}