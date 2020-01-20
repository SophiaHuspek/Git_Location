package com.example.git_location;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private  static LocationManager locMan = null;

    LinkedList<MyLocation> locations = new LinkedList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locMan = (LocationManager) getSystemService(LOCATION_SERVICE);

    }

    public void btnAnzeigenClicked(View view) {


    }
}
