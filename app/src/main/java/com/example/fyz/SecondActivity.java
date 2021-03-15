package com.example.fyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //добавление спискового представления с помощью адаптера массивов
        ArrayAdapter<Thing> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Thing.drinks
        );
        ListView listDrinks = (ListView) findViewById(R.id.list_drinks);
        listDrinks.setAdapter(listAdapter);

        //создание слушателя
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            //вызываем при щелчке на варианте в списковом представлении
            public void onItemClick(AdapterView<?> listDrinks,
                                    View itemView, int position, long id) {
                //Передача напитка, вызванного пользователем, DrinkActivity
                Intent intent = new Intent(SecondActivity.this,
                        ThirdActivity.class);
                intent.putExtra(ThirdActivity.EXTRA_DRINKID, (int) id);
                startActivity(intent);
            }
        };

        //Назначение слушателя для спискового представления
        listDrinks.setOnItemClickListener(itemClickListener);
    }
}