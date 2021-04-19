package com.dgioto.fyz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
                Promotions.class);
        startActivity(intent);
    }
    public void onClickShippingPayment(View view){
        Intent intent = new Intent(
                MainActivity.this,
                ShippingPayment.class);
        startActivity(intent);
    }
    public void onClickContacts(View view){
        Intent intent = new Intent(
                MainActivity.this,
                Contacts.class);
        startActivity(intent);
    }
    public void onClickAboutUs(View view){
        Intent intent = new Intent(
                MainActivity.this,
                AboutUs.class);
        startActivity(intent);
    }

    public void onClickWeb(View view){
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, "fyz.com.ua");
        startActivity(intent);
    }
}