package com.imagetest.adapters;

/**
 * Created by Petkovski on 22.03.2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.imagetest.R;
import com.imagetest.models.GaleryResults;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private static final String TAG = RecyclerViewAdapter.class.getSimpleName();

    private GaleryResults data;
    private Context context;

    public RecyclerViewAdapter(Context context, GaleryResults results) {
        this.data = results;
        this.context = context;
    }


    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_grid, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.imageName.setText(data.getData().get(position).getTitle());
        //ising glide instead of Picasso hope its ok
        //Picasso.with(context).load(data.getData().get(position).getLink()).into(holder.imagePhoto);
        Log.d(TAG, "link :" + data.getData().get(position).getLink());
        Glide.with(context).load(data.getData().get(position).getLink()).placeholder(R.drawable.ic_no_image_placeholder).into(holder.imagePhoto);

    }

    @Override
    public int getItemCount() {
        return this.data.getData().size();
    }
}
