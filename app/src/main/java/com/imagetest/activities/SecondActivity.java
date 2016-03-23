package com.imagetest.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.imagetest.R;
import com.imagetest.fragments.SecondFragment;
import com.imagetest.util.ProgressListener;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Petkovski on 23.03.2016.
 */
public class SecondActivity extends BaseActivity implements ProgressListener {
    private final String TAG = SecondActivity.class.getSimpleName();

    @Bind(R.id.second_progress)
    ProgressBar progressBar;
    @Bind(R.id.second_text)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        displayFragment(new SecondFragment());

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onProgressChanged(int progress) {
        Log.d(TAG, "progress changed : " + progress);
        setProgressViews(progress);
    }

    @Override
    public void onTaskCanceled() {
        textView.setText(R.string.canceled);
    }

    private void setProgressViews(int progress) {
        progressBar.setProgress(progress);
        textView.setText("Progress at: " + progress + "%");
    }
}
