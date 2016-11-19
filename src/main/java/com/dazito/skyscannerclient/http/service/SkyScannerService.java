package com.dazito.skyscannerclient.http.service;

import com.dazito.skyscannerclient.data.polling.PollingResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by daz on 11/11/2016.
 */
public interface SkyScannerService {

    @POST("pricing/v1.0")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @FormUrlEncoded
    Call<ResponseBody> createSession(@Field("apiKey") String apiKey,
                                     @Field("country") String country,
                                     @Field("currency") String currency,
                                     @Field("locale") String locale,
                                     @Field("originplace") String originPlace,
                                     @Field("destinationplace") String destinationPlace,
                                     @Field("locationschema") String locationSchema,
                                     @Field("outbounddate") String outboundDate,
                                     @Field("inbounddate") String inboundDate,
                                     @Field("adults") int adults);

    @GET("pricing/v1.0/{sessionKey}")
    Call<PollingResponse> pollSession(@Path("sessionKey") String sessionKey, @Query("apiKey") String apiKey);
}
