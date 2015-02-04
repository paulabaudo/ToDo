package com.globant.paulabaudo.todo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by paula.baudo on 04/02/2015.
 */
public class TaskAdapter extends ArrayAdapter<Task> {

    Context mContext;
    List<Task> mTask;

    public TaskAdapter(Context context, List<Task> task) {
        super(context, R.layout.list_view_item_entry, task);
        mContext = context;
        mTask = task;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        rowView = reuseOrGenerateRowView(convertView, parent);
        displayContentInView(position, rowView);

        return rowView;
    }

    private View reuseOrGenerateRowView(View convertView, ViewGroup parent) {
        View rowView;
        if (convertView != null) {
            rowView = convertView;
        } else {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_view_item_entry, parent, false);
        }
        return rowView;
    }

    private void displayContentInView(int position, View rowView) {
        if (rowView != null) {
            TextView textViewTitle = (TextView)rowView.findViewById(R.id.text_view_title);
            textViewTitle.setText(mTask.get(position).getmTaskTitle());
            CheckBox checkBoxCompleted =(CheckBox)rowView.findViewById(R.id.item_checkbox);
            checkBoxCompleted.setChecked(mTask.get(position).getmCompleted());
        }
    }
}
