package com.example.suhussai.as1.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.suhussai.as1.R;
import com.example.suhussai.as1.controller.AppController;

public class logView extends Activity{

    private ListView listView;
    private AppController appController = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_view);
        appController = AppController.getAppController(this);
        listView = (ListView) findViewById(R.id.listView);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setResult(RESULT_OK);
                appController.setMessageIDToEdit(-1);
                startActivity(new Intent(logView.this, MainActivity.class));
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appController.setMessageIDToEdit(listView.getItemAtPosition(position));
                startActivity(new Intent(logView.this, entry_config.class));

            }
        });

    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item, appController.getLogs());
        listView.setAdapter(adapter);
        TextView textView = (TextView) findViewById(R.id.textViewTotalCost);
        appController = AppController.getAppController(this);
        textView.setText("Total Cost: $" + appController.getTotalCost());
    }

    @Override
    public void onStop() {
        // ref: http://stackoverflow.com/questions/18361719/android-activity-ondestroy-is-not-always-called-and-if-called-only-part-of-th
        appController.saveData();
        super.onStop();
    }


}

