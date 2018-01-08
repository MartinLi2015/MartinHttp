package com.martin.martinhttp;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by lixinliang on 2018/1/8.
 */

public interface ApiServices {

    @Headers("urlName:douban")
    @GET("/v2/movie/nowplaying")
    Observable<Movies> getPlayingMovies(@Query("apikey") String apikey);

}
