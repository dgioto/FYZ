package com.example.fyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //добавление спискового представления с помощью адаптера массивов
        ArrayAdapter<Thing> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Thing.drinks
        );
        ListView listChemistry = (ListView) findViewById(R.id.list_chemistry);
        listChemistry.setAdapter(listAdapter);

        //создание слушателя
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            //вызываем при щелчке на варианте в списковом представлении
            public void onItemClick(AdapterView<?> listChemistry,
                                    View itemView, int position, long id) {
                //Передача напитка, вызванного пользователем, DrinkActivity
                Intent intent = new Intent(ThirdActivity.this,
                        FourthActivity.class);
                intent.putExtra(FourthActivity.EXTRA_DRINKID, (int) id);
                startActivity(intent);
            }
        };

        //Назначение слушателя для спискового представления
        listChemistry.setOnItemClickListener(itemClickListener);
    }
}