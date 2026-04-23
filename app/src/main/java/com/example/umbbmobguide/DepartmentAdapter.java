package com.example.umbbmobguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DepartmentAdapter extends ArrayAdapter<Department> {

    public DepartmentAdapter(Context context, ArrayList<Department> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_department, parent, false);
        }

        Department department = getItem(position);

        ImageView img = convertView.findViewById(R.id.imgDepartment);
        TextView txt = convertView.findViewById(R.id.txtDepartmentName);

        img.setImageResource(department.getLogo());
        txt.setText(department.getName());

        return convertView;
    }
}