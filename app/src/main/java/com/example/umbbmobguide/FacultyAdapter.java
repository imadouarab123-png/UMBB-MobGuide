package com.example.umbbmobguide;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class FacultyAdapter extends ArrayAdapter<Faculty> {

    public FacultyAdapter(Context context, ArrayList<Faculty> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_faculty, parent, false);
        }

        Faculty faculty = getItem(position);

        ImageView img = convertView.findViewById(R.id.imgLogo);
        TextView txt = convertView.findViewById(R.id.txtName);

        img.setImageResource(faculty.getLogo());
        txt.setText(faculty.getName());

        return convertView;
    }
}