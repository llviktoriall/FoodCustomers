package com.example.foodcustomers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodcustomers.adapter.BasketAdaptor;
import com.example.foodcustomers.model.Food;

import java.util.ArrayList;
import java.util.List;

public class Basket extends AppCompatActivity {

    RecyclerView basketRecycle;
    BasketAdaptor basketAdaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
        List<Food> basketList = new ArrayList<>();
        basketList.add(new Food("Круассан", 55, "Выпечка", R.drawable.food_1));

        setBasketRecycle(basketList);
    }

    private void setBasketRecycle(List<Food> foodList){
        basketRecycle = findViewById(R.id.food_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        basketRecycle.setLayoutManager(layoutManager);
        basketAdaptor = new BasketAdaptor(this, foodList);
        basketRecycle.setAdapter(basketAdaptor);
    }

    public void onMyButtonClick(View view)
    {
        // выводим сообщение
        Toast.makeText(this, "Зачем вы нажали?", Toast.LENGTH_SHORT).show();
    }

}
