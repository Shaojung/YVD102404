package com.example.user.yvd102404;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Spinner spinner2;
    String fruit[] = {"蘋果","葡萄","芭樂","芒果","甘蔗","鳳梨"};
    String cities[] = {"台北", "台中","高雄"};
    String codes[] = {"02", "04", "07"};
    ArrayAdapter<String> adapter;
    ArrayList<Map<String, String>> mylist;
    SimpleAdapter adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);

        adapter = new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_item, fruit);
        spinner.setAdapter(adapter);

        // ======================
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        mylist = new ArrayList<>();
        for (int i=0;i<cities.length;i++)
        {
            HashMap<String,String> m1 = new HashMap<>();
            m1.put("city", cities[i]);
            m1.put("code", codes[i]);
            mylist.add(m1);
        }

        adapter2 = new SimpleAdapter(MainActivity.this,
                    mylist,
                    R.layout.myitem,
                    new String[]{"city", "code"},
                    new int[] {R.id.tvCity, R.id.tvCode}
                    );
        spinner2.setAdapter(adapter2);
    }
}
