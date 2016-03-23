package com.imagetest.server;

import com.imagetest.models.GaleryResults;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Petkovski on 22.03.2016.
 */
public interface ServerEndpoints {

    @GET(ServerConstants.GALLERY_API)
    void searchApi(Callback<GaleryResults> callback);


}
