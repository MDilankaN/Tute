package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.CyclicBarrier;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TxtVM2);
        txtVMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate Called...");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle","OnStart Called...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Lifecycle","OnResume Called...");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecycle","OnPause Called...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle","OnDestroy Called...");
    }
}