package com.globant.paulabaudo.todo;

import android.content.Context;

/**
 * Created by paula.baudo on 04/02/2015.
 */
public class Task {

    String mTaskTitle;
    Boolean mCompleted;

    public Task (){

    }

    public Task (String title) {
        this.mTaskTitle = title;
        this.mCompleted = false;
    }

    public String getmTaskTitle() {
        return mTaskTitle;
    }

    public void setmTaskTitle(String mTaskTitle) {
        this.mTaskTitle = mTaskTitle;
    }

    public Boolean getmCompleted() {
        return mCompleted;
    }

    public void setmCompleted(Boolean mCompleted) {
        this.mCompleted = mCompleted;
    }
}
