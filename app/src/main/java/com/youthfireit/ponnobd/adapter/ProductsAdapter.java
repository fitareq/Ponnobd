package com.youthfireit.ponnobd.adapter;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.youthfireit.ponnobd.R;
import com.youthfireit.ponnobd.models.Products;

import java.util.List;


public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsHolder> {

    private List<Products> products;



    public ProductsAdapter(List<Products> products) {

        this.products = products;
    }



    @NonNull
    @Override
    public ProductsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.products_card_view,parent,false);

        return new ProductsHolder(v);
    }



    @Override
    public void onBindViewHolder(@NonNull ProductsHolder holder, int position) {

        Products current = products.get(position);
        String p;
        String title = current.getProductName();
        String price = current.getProductPrice();
        String regular_price = current.getProductRegularPrice();
        String stock = current.getProductStockStatus();
        String image = current.getProductImages().get(0).getSrc();
        String percentage = calculatePercentage(Integer.parseInt(regular_price),Integer.parseInt(price));



        if (image!=null)
        {
            Picasso.get().load(image).into(holder.productsImage);
        }
        holder.productsTitle.setText(title);


        if (TextUtils.equals(regular_price,price))
        {
            p = "৳"+regular_price;
            holder.regularPrice.setVisibility(View.GONE);
            holder.discountedPrice.setText(p);
        }else {
            p = "৳"+regular_price;
            holder.regularPrice.setText(p);
            holder.regularPrice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            p = "৳"+price;
            holder.discountedPrice.setText(p);
        }
        holder.stockStatus.setText(stock);
        if (!TextUtils.equals(percentage,"0"))
        {
            percentage = "-"+percentage+"%";
            holder.offerPercentage.setText(percentage);
        }else holder.offerPercentage.setVisibility(View.GONE);

    }



    @Override
    public int getItemCount() {

        return products.size();
    }



    public class ProductsHolder extends RecyclerView.ViewHolder
{
    ImageView productsImage;
    TextView productsTitle, regularPrice, discountedPrice, offerPercentage, stockStatus;


    public ProductsHolder(@NonNull View itemView) {

        super(itemView);
        productsImage = itemView.findViewById(R.id.product_imageview);
        productsTitle = itemView.findViewById(R.id.product_title_textview);
        regularPrice = itemView.findViewById(R.id.product_regular_price_textview);
        discountedPrice = itemView.findViewById(R.id.product_discounted_price_textview);
        offerPercentage = itemView.findViewById(R.id.product_offer_percentage_textview);
        stockStatus = itemView.findViewById(R.id.product_stock_status_textview);
    }




}


String calculatePercentage(int regularprice, int discountedprice)
{

    int diff = regularprice-discountedprice;

    int percentage = (diff*100)/regularprice;
    return String.valueOf(percentage);
}
}
