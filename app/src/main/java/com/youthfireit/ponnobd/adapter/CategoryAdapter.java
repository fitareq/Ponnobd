package com.youthfireit.ponnobd.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.youthfireit.ponnobd.R;
import com.youthfireit.ponnobd.roomdata.models.Categories;
import com.youthfireit.ponnobd.roomdata.models.ProductImages;

import java.util.List;


public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private List<Categories> categories;



    public CategoryAdapter(List<Categories> categories) {

        this.categories = categories;
    }



    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_card_view,parent,false);

        return new CategoryViewHolder(v);
    }



    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Categories current = categories.get(position);
        ProductImages i = current.getImage();
        String image = null;
        if (i!=null)
            image = i.getSrc();
        String title = current.getName();

        if (image!=null)
            Picasso.get().load(image).into(holder.imageView);
        holder.textView.setText(title);
    }



    @Override
    public int getItemCount() {

        return categories.size();
    }



    public class CategoryViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;

        public CategoryViewHolder(@NonNull View itemView) {

            super(itemView);
            imageView = itemView.findViewById(R.id.category_image);
            textView = itemView.findViewById(R.id.category_title);
        }




    }
}
