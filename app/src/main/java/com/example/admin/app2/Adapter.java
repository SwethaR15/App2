package com.example.admin.app2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseExpandableListAdapter {

    String[] group;
    String[][] prod_name;
    int[][] images;
    int[][] prod_price;
    Context context;

    Adapter(Context context, String[] group, String [][] prod_name, String[][] images, int[][] prod_price){
        this.context=context;
        this.group=group;
        this.prod_name=prod_name;
        this.prod_price=prod_price;
        this.images=images;

    }
    @Override
    public int getGroupCount() {
        return group.length;
    }

    @Override
    public int getChildrenCount(int i) {
        return prod_name[i].length;
    }

    @Override
    public Object getGroup(int i) {
        return null;
    }

    @Override
    public Object getChild(int i, int i1) {
        return null;
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        View  cview = LayoutInflater.from(context).inflate(R.layout.parent, viewGroup, false);
        TextView name=cview.findViewById(R.id.parent);
        name.setText(group[i]);

        view=cview;

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        View  cview = LayoutInflater.from(context).inflate(R.layout.child, viewGroup, false);

        ImageView imageView=cview.findViewById(R.id.image);
        imageView.setImageResource(images[i][i1]);
        TextView name=cview.findViewById(R.id.childd);
        name.setText(prod_name[i][i1]);
        TextView name1=cview.findViewById(R.id.textView3);
        name1.setText(prod_price[i][i1]);


        view=cview;

        return view;

    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
