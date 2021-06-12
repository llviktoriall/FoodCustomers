package com.example.foodcustomers.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodcustomers.R;
import com.example.foodcustomers.model.Food;

import java.util.List;

public class BasketAdaptor extends RecyclerView.Adapter<BasketAdaptor.FoodViewHolder> {

    Context context;
    List<Food> foodList;

    public BasketAdaptor(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.food_row_item, parent, false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(foodList.get(position).getImageURL());
        holder.name.setText((CharSequence)foodList.get(position).getName());
        holder.price.setText(String.valueOf(foodList.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public static final class FoodViewHolder extends RecyclerView.ViewHolder {

        ImageView foodImage;
        TextView price, name;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.item_image);
            price = itemView.findViewById(R.id.item_price);
            name = itemView.findViewById(R.id.item_name);
        }
    }
}
