package com.mikepenz.materialdrawer.model;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mikepenz.materialdrawer.R;

public class BaseViewHolder extends ViewHolder {
    protected TextView description;
    protected ImageView icon;
    protected TextView name;
    protected View view;

    public BaseViewHolder(View view) {
        super(view);
        this.view = view;
        this.icon = (ImageView) view.findViewById(R.id.material_drawer_icon);
        this.name = (TextView) view.findViewById(R.id.material_drawer_name);
        this.description = (TextView) view.findViewById(R.id.material_drawer_description);
    }
}