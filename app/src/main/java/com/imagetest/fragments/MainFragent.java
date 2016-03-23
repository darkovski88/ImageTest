package com.imagetest.fragments;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imagetest.R;
import com.imagetest.adapters.RecyclerViewAdapter;
import com.imagetest.models.GaleryResults;
import com.imagetest.server.ServerConstants;
import com.imagetest.server.ServerEndpoints;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Petkovski on 21.03.2016.
 */
public class MainFragent extends BaseFragment {

    private final String TAG = MainFragent.class.getSimpleName();
    private View view;

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;

    private GridLayoutManager lLayout;
    private RestAdapter myRestAdapter;
    private ServerEndpoints serverEndpoints;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        setRetainInstance(true);

        init();

        return view;
    }

    /**
     * Initialize fragment views, etc..
     */
    private void init() {

        lLayout = new GridLayoutManager(getActivity(), 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lLayout);

        if (isOnline()) {
            fetchServerData();
        } else {
            makeToast(getString(R.string.no_internet));
        }
    }

    /**
     * Get data from server
     */
    private void fetchServerData() {
        showProgress(getString(R.string.please_wait));
        RequestInterceptor requestInterceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                request.addHeader("Authorization", "Client-ID " + getString(R.string.imgur_id));
            }
        };

        myRestAdapter = new RestAdapter.Builder()
                .setEndpoint(ServerConstants.BASE_URL)
                .setRequestInterceptor(requestInterceptor)
                .build();
        serverEndpoints = myRestAdapter.create(ServerEndpoints.class);
        serverEndpoints.searchApi(new Callback<GaleryResults>() {
            @Override
            public void success(GaleryResults results, Response response) {
                Log.d(TAG, "success");
                RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getActivity(), results);
                recyclerView.setAdapter(rcAdapter);
                dismissProgress();
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(TAG, "fail " + error.getMessage());
                dismissProgress();
            }
        });
    }


}
