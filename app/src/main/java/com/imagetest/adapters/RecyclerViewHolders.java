package com.imagetest.adapters;

/**
 * Created by Petkovski on 22.03.2016.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.imagetest.R;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView imageName;
    public ImageView imagePhoto;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        imageName = (TextView) itemView.findViewById(R.id.item_name);
        imagePhoto = (ImageView) itemView.findViewById(R.id.item_img);
    }

    @Override
    public void onClick(View view) {
        //TODO
    }
}