package com.dgioto.fyz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChemistryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);

        //добавление спискового представления с помощью адаптера массивов
        ArrayAdapter<Chemistry> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Chemistry.chemistry
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
                Intent intent = new Intent(ChemistryActivity.this,
                        CardProductActivity.class);
                intent.putExtra(CardProductActivity.EXTRA_CHEMID, (int) id);
                startActivity(intent);
            }
        };

        //Назначение слушателя для спискового представления
        listChemistry.setOnItemClickListener(itemClickListener);
    }
}