package com.anip.meow.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anip.meow.R;
import com.anip.meow.model.Item;
import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by anip on 03/03/18.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> list;
    private Context context;
    public ItemAdapter(Context context, List<Item> list){
        this.context = context;
        this.list = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        Item item = list.get(position);
        DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        try {
            Date date = sdf.parse(item.getTime());
            holder.time.setText(date.toString());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        holder.title.setText(item.getTitle());
        Picasso.with(context).load(item.getImage()).into(holder.image);
        holder.time.setText(item.getTime());
        holder.description.setText(item.getDescription());
//        holder.t


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title, description, time;
        public ImageView image;

        public ViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            image = (ImageView) view.findViewById(R.id.image);
            time = (TextView) view.findViewById(R.id.time);
            description = (TextView) view.findViewById(R.id.description);
        }
    }
}
