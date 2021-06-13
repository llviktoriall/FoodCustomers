package com.example.foodcustomers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodcustomers.adapter.FoodAdapter;
import com.example.foodcustomers.model.Food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView foodRecycle;
    FoodAdapter foodAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //try {
        //    ConnectDB db = new ConnectDB("http://10.0.2.2:8080/products");
        //    String s = db.GetInfo();
        //} catch (IOException e) {
         //   e.printStackTrace();
        //}

        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("Круассан", 55, "Выпечка", R.drawable.food_1));
        foodList.add(new Food("Сосиска в тесте", 35, "Выпечка", R.drawable.food_2));
        foodList.add(new Food("Пицца", 85, "Выпечка", R.drawable.food_3));
        foodList.add(new Food("Круассан", 55, "Выпечка", R.drawable.food_1));
        foodList.add(new Food("Сосиска в тесте", 35, "Выпечка", R.drawable.food_2));
        foodList.add(new Food("Пицца", 85, "Выпечка", R.drawable.food_3));


        setFoodRecycle(foodList);
    }

    private void setFoodRecycle(List<Food> foodList){
        foodRecycle = findViewById(R.id.basket_recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        foodRecycle.setLayoutManager(layoutManager);
        foodAdapter = new FoodAdapter(this, foodList);
        foodRecycle.setAdapter(foodAdapter);
    }

    public void onBasketButtonClick(View view)
    {
        Intent intent = new Intent(MainActivity.this, Basket.class);
        startActivity(intent);
    }

    public void onAddRowItemClick(View view)
    {
        // выводим сообщение
        Toast.makeText(this, "Товар добавлен!", Toast.LENGTH_SHORT).show();
    }

    public void onOrderButtonClick(View view)
    {
        // выводим сообщение
        Toast.makeText(this, "Ваш заказ еще не готов!", Toast.LENGTH_SHORT).show();
    }

}
