package com.imagetest.fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Petkovski on 21.03.2016.
 */
public class BaseFragment extends Fragment implements View.OnClickListener {
    private ProgressDialog progress;

    @Override
    public void onClick(View v) {
        //TODO
    }

    /**
     * Check if internet connection is available
     *
     * @return
     */
    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }

    /**
     * Show toast with message
     *
     * @param message
     */
    public void makeToast(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }

    /**
     * Display a progress dialog with message
     *
     * @param message
     */
    public void showProgress(String message) {
        progress = ProgressDialog.show(getActivity(), "",
                message, true);
    }

    /**
     * Dismiss the progress bar if shown
     */
    public void dismissProgress() {
        if (progress != null) {
            if (progress.isShowing()) {
                progress.dismiss();
            }
        }
    }
}
