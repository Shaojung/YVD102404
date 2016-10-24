package com.example.user.yvd102404;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String fruit[] = {"蘋果","葡萄","芭樂","芒果","甘蔗","鳳梨"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);

        adapter = new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_item, fruit);
        spinner.setAdapter(adapter);
    }
}
