package com.example.umbbmobguide;
import android.content.Context;
import android.view.LayoutInflater;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FacultyAdapter extends ArrayAdapter<Faculty> {

    private ArrayList<Faculty> originalList;
    private ArrayList<Faculty> filteredList;

    public FacultyAdapter(Context context, ArrayList<Faculty> list) {
        super(context, 0, list);
        this.originalList = new ArrayList<>(list);
        this.filteredList = new ArrayList<>(list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_faculty, parent, false);
        }

        Faculty faculty = filteredList.get(position);

        ImageView img = convertView.findViewById(R.id.imgLogo);
        TextView txt = convertView.findViewById(R.id.txtName);

        img.setImageResource(faculty.getLogo());
        txt.setText(faculty.getName());

        return convertView;
    }

    @Override
    public int getCount() {
        return filteredList.size();
    }

    @Override
    public Faculty getItem(int position) {
        return filteredList.get(position);
    }

    @Override
    public android.widget.Filter getFilter() {
        return new android.widget.Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();
                if (constraint == null || constraint.length() == 0) {
                    results.values = originalList;
                    results.count = originalList.size();
                } else {
                    ArrayList<Faculty> filtered = new ArrayList<>();
                    String query = constraint.toString().toLowerCase();
                    for (Faculty faculty : originalList) {
                        if (faculty.getName().toLowerCase().contains(query)) {
                            filtered.add(faculty);
                        }
                    }
                    results.values = filtered;
                    results.count = filtered.size();
                }
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                filteredList = (ArrayList<Faculty>) results.values;
                notifyDataSetChanged();
            }
        };
    }
}