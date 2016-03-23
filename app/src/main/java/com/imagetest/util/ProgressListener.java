package com.imagetest.util;

/**
 * Created by Petkovski on 23.03.2016.
 * Progress listener that makes a callback from SecondFramgnet to his parent activity
 */
public interface ProgressListener {

    void onProgressChanged(int progress);

    void onTaskCanceled();
}
