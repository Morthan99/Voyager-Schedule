package com.example.krzych.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class Main_Menu extends AppCompatActivity {

    private Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu);

    }
    public void onBackPressed()
    {
        if(toast!=null&&toast.getView().getWindowToken()!=null)
        {
            System.exit(0);
        }else
            {
                toast = Toast.makeText(this,"Wcisnij druigi raz aby wyjść",Toast.LENGTH_SHORT);
                toast.show();
        }
    }
    public void bielskPodlaski(View view) {

        Intent intent = new Intent(".BielskPodlaski");
        startActivity(intent);
    }
    public void bialowieza(View view) {
        Intent intent = new Intent(".bialowieza");
        startActivity(intent);
    }

    public void grodek(View view) {
        Intent intent = new Intent(".grodek");
        startActivity(intent);
    }

    public void turosnKoscielna(View view) {
        Intent intent = new Intent(".turosnKoscielna");
        startActivity(intent);
    }

    public void tykocin(View view) {
        Intent intent = new Intent(".tykocin");
        startActivity(intent);
    }

    public void suprasl(View view) {
        Intent intent = new Intent(".suprasl");
        startActivity(intent);
    }

    public void sokolka(View view) {
        Intent intent = new Intent(".sokolka");
        startActivity(intent);
    }

    public void czarnaBialostocka(View view) {
        Intent intent = new Intent(".czarnaBialostocka");
        startActivity(intent);
    }

    public void suwalki(View view) {
        Intent intent = new Intent(".suwalki");
        startActivity(intent);
    }
}
