package com.dgioto.fyz;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CardProductActivity extends AppCompatActivity {

    public static final String EXTRA_CHEMID = "chemId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_product);



        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //получить напиток из данный интента
        int chemId = (Integer) getIntent().getExtras().get(EXTRA_CHEMID);
        Chemistry chem = Chemistry.chemistry[chemId];

        //Заполнение названия напитка
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(chem.getName());

        //Заполнить описание напитка
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(chem.getDescription());

        //Заполнить изображения напитка
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(chem.getImageResourceId());
        photo.setContentDescription(chem.getName());
    }

    public  void onClickCall(View view){
        String phone = "050 811 63 93";
        Intent intent = new Intent(Intent.ACTION_DIAL,
                Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }
}