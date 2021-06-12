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
    List<Food> basketList;

    public BasketAdaptor(Context context, List<Food> basketList) {
        this.context = context;
        this.basketList = basketList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.basket_row_item, parent, false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(basketList.get(position).getImageURL());
        holder.name.setText((CharSequence) basketList.get(position).getName());
        holder.price.setText(String.valueOf(basketList.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return basketList.size();
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
