package com.dgioto.fyz;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

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
                    Intent intent = new Intent(
                            CategoriesActivity.this,
                            ChemistryActivity.class);
                    startActivity(intent);
                }
                else if (position == 2){
                    Intent intent = new Intent(
                            CategoriesActivity.this,
                            ChemistryActivity.class);
                    startActivity(intent);
                }
                else if (position == 3){
                    Intent intent = new Intent(
                            CategoriesActivity.this,
                            ChemistryActivity.class);
                    startActivity(intent);
                }
                else if (position == 4){
                    Intent intent = new Intent(
                            CategoriesActivity.this,
                            ChemistryActivity.class);
                    startActivity(intent);
                }
                else if (position == 5){
                    Intent intent = new Intent(
                            CategoriesActivity.this,
                            ChemistryActivity.class);
                    startActivity(intent);
                }
                else if (position == 6){
                    Intent intent = new Intent(
                            CategoriesActivity.this,
                            ChemistryActivity.class);
                    startActivity(intent);
                }
            }
        };

        //???????????????????? ?????????????????? ?? ???????????????????? ??????????????????????????
        ListView listView = (ListView) findViewById(R.id.list_categories);
        listView.setOnItemClickListener(itemClickListener);
    }
}