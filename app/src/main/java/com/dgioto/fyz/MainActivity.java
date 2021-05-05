package com.dgioto.fyz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.ShareActionProvider;

import static androidx.core.view.MenuItemCompat.getActionProvider;

public class MainActivity extends AppCompatActivity {

    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem idSearch = menu.findItem(R.id.id_search);
        SearchView sv = (SearchView) idSearch.getActionView();
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.web_search:
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, "fyz.com.ua");
                startActivity(intent);
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
}