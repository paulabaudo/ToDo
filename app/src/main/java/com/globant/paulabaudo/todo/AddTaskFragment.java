package com.globant.paulabaudo.todo;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddTaskFragment extends Fragment {

    public AddTaskFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_add_task, container, false);

        Button buttonDone = (Button) rootView.findViewById(R.id.button_done);

        buttonDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity activity = getActivity();
                EditText editTextTaskTitle = (EditText) rootView.findViewById(R.id.edit_text_task_title);
                if (!TextUtils.isEmpty(editTextTaskTitle.getText().toString())){
                    Intent intentResult = new Intent();
                    intentResult.putExtra(TaskListFragment.TASK_TITLE, editTextTaskTitle.getText().toString());
                    activity.setResult(Activity.RESULT_OK, intentResult);
                }
                activity.finish();
            }
        });

        return rootView;
    }

    private Fragment getFragment(){
        return AddTaskFragment.this;
    }


}
