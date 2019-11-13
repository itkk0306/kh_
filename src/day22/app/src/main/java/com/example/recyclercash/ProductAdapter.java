package com.example.recyclercash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    ArrayList<Product> items = new ArrayList<>();

    OnProductItemClickListener listener;

  public ProductAdapter.ViewHolder onCreateViewHolder(
          @NonNull ViewGroup parent, int viewType){
      LayoutInflater inflater =
              LayoutInflater.from(parent.getContext());
      View itemView = inflater.inflate(R.layout.product_item, parent, false);

      return ViewHolder(itemView, this);
  }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product item = items.get(position);
        holder.setItem();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Product item){
      items.add(item);
    }

    public void setItems(ArrayList<Product> items){
      this.items = items;
    }

    public Product getItems(int position) {
        return items.get(position);
    }
    public void setItem(int position, Product item){
      items.set(position,item);
    }

    public void setOnItemClickListener(OnProductItemClickListener listener){
      this.listener = listener;
    }
    public void onItemClick(ViewHolder holder, View view, int position){
      if(listener != null){
          listener.onItemClick(holder, view, position);
      }
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
                TextView tv1, tv2, tv3, tv4;
                ImageView imageView;

                public ViewHolder(View itemView, final  OnProductItemClickListener listener){
                    super(itemView);

                    tv1 = (TextView)itemView.findViewById(R.id.textView1);
                    tv2 = (TextView)itemView.findViewById(R.id.textView2);
                    tv3 = (TextView)itemView.findViewById(R.id.textView3);
                    tv4 = (TextView)itemView.findViewById(R.id.textView4);

                    imageView = (imageView)itemView.findViewById(R.id.imageView1);

                    itemView.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            int position = getAdapterPosition();

                            if(listener != null){
                                listener.onItemClick(
                                        ViewHolder.this,
                                        v,position);
                            }
                        }
                    });
                }
                public void setItem(Product item){
                    tv1.setText(String.valueOf(item.getCountAgent()));
                    tv2.setText(item.getName());
                    tv3.setText(String.valueOf(item.getPrice()));
                    imgView.setImageResource
                }
          }

}
