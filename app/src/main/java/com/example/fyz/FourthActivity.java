package com.example.fyz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);



        //получить напиток из данный интента
        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Thing drink = Thing.drinks[drinkId];

        //Заполнение названия напитка
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        //Заполнить описание напитка
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());

        //Заполнить изображения напитка
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}