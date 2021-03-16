package com.example.fyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(
                            CategoriesActivity.this,
                            ChemistryActivity.class);
                    startActivity(intent);
                }
                else if (position == 1){

                }
                else if (position == 2){

                }
                else if (position == 3){

                }
                else if (position == 4){

                }
                else if (position == 5){

                }
                else if (position == 6){

                }
            }
        };

        //Добавление слушателя к списковому представлению
        ListView listView = (ListView) findViewById(R.id.list_categories);
        listView.setOnItemClickListener(itemClickListener);
    }
}