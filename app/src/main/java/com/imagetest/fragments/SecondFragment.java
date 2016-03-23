package com.imagetest.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.imagetest.R;
import com.imagetest.util.ProgressListener;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Petkovski on 23.03.2016.
 */
public class SecondFragment extends BaseFragment {
    private final String TAG = SecondFragment.class.getSimpleName();

    private View view;
    private ProgressListener progressListener;
    private int progress;
    private Handler handler = new Handler();
    private AsyncTask task;
    private Activity activity;

    @Bind(R.id.second_frag_cancel)
    Button cancel;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        progressListener = (ProgressListener) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        if (container == null) // must put this in
            return null;
        view = inflater.inflate(R.layout.fragment_second, container, false);
        ButterKnife.bind(this, view);
        setRetainInstance(true);
        init();

        return view;
    }

    //init view in fragment
    private void init() {
        progress = 0;
        activity = getActivity();
        cancel.setOnClickListener(this);
        runTask();
    }

    //run task in background to increment progress in parent activity
    private void runTask() {
        task = new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... params) {
                while (progress < 100) {
                    if (isCancelled())
                        break;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressListener.onProgressChanged(progress);
                            progress += 1;
                        }
                    });

                    Log.d(TAG, "current progress: " + progress);
                }
                cancel(true);
                return null;

            }
        }.execute();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        cancelTask();
    }

    private void cancelTask() {
        if (task != null) {
            task.cancel(true);
            progressListener.onTaskCanceled();
        }
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.second_frag_cancel:
                cancelTask();
                break;
        }
    }
}