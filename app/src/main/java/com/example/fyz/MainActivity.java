package com.example.fyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //создание объект слушателя
//        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
//                if (position == 0){
//                    Intent intent = new Intent(
//                            MainActivity.this,
//                            CategoriesActivity.class);
//                    startActivity(intent);
//                }
//             }
//        };
//        //Добавление слушателя к списковому представлению
//        ListView listView = (ListView) findViewById(R.id.list_options);
//        listView.setOnItemClickListener(itemClickListener);
    }

    public void onClickCategories(View view){
        Intent intent = new Intent(
                MainActivity.this,
                CategoriesActivity.class);
        startActivity(intent);
    }

    public void onClickPromotions(View view){
        Intent intent = new Intent(
                MainActivity.this,
                CategoriesActivity.class);
        startActivity(intent);
    }
    public void onClickShippingPayment(View view){
        Intent intent = new Intent(
                MainActivity.this,
                CategoriesActivity.class);
        startActivity(intent);
    }
    public void onClickСontacts(View view){
        Intent intent = new Intent(
                MainActivity.this,
                CategoriesActivity.class);
        startActivity(intent);
    }
    public void onClickAboutUs(View view){
        Intent intent = new Intent(
                MainActivity.this,
                CategoriesActivity.class);
        startActivity(intent);
    }
}