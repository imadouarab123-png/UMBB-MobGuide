package com.example.umbbmobguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SpecialityAdapter extends ArrayAdapter<Speciality> {

    public SpecialityAdapter(Context context, ArrayList<Speciality> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Speciality item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_speciality, parent, false);
        }


        TextView name = convertView.findViewById(R.id.name);
        name.setText(item.name);

        return convertView;
    }
}