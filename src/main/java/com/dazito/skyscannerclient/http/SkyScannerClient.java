package com.dazito.skyscannerclient.http;

import com.dazito.skyscannerclient.data.polling.PollingResponse;
import com.dazito.skyscannerclient.data.session.SessionRequest;
import com.dazito.skyscannerclient.http.service.SkyScannerService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

/**
 * Created by daz on 11/11/2016.
 */
public class SkyScannerClient {

    private final Retrofit retrofit;
    private final SkyScannerService service;
    private final String apiKey;

    public SkyScannerClient(String apiKey){
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.SKY_SCANNER_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(SkyScannerService.class);

        this.apiKey = apiKey;
    }

    /**
     * Create a SkyScanner session. @see <a href="https://support.business.skyscanner.net/hc/en-us/articles/211308489-Flights-Live-Pricing</a>
     * @param sessionRequest a {@link com.dazito.skyscannerclient.data.session.SessionRequest} object containing all the information needed to create the session
     * @return a {@link retrofit2.Response} containing the response received from SkyScanner.
     * @throws IOException
     */
    public Response createSession(SessionRequest sessionRequest) throws IOException {
        Call<ResponseBody> call =  service.createSession(apiKey, sessionRequest.getCountry(),
                sessionRequest.getCurrency(), sessionRequest.getLocale(), sessionRequest.getOriginPlace(),
                sessionRequest.getDestinationPlace(), sessionRequest.getLocationSchema().toString(),
                sessionRequest.getOutboundDate(), sessionRequest.getInboundDate(),
                sessionRequest.getAdults());
        return call.execute();
    }

    /**+
     * Create a SkyScanner session. @see <a href="https://support.business.skyscanner.net/hc/en-us/articles/211308489-Flights-Live-Pricing</a>
     * @param sessionRequest a {@link com.dazito.skyscannerclient.data.session.SessionRequest} object containing all the information needed to create the session
     * @param callback the {@link retrofit2.Callback} to process the response
     * @throws IOException
     */
    public void createSession(SessionRequest sessionRequest, Callback<ResponseBody> callback) throws IOException {
        Call<ResponseBody> call = service.createSession(apiKey, sessionRequest.getCountry(),
                sessionRequest.getCurrency(), sessionRequest.getLocale(), sessionRequest.getOriginPlace(),
                sessionRequest.getDestinationPlace(), sessionRequest.getLocationSchema().toString(),
                sessionRequest.getOutboundDate(), sessionRequest.getInboundDate(),
                sessionRequest.getAdults());
        call.enqueue(callback);
    }

    /**
     * Poll the session for results. @see <a href="https://support.business.skyscanner.net/hc/en-us/articles/211308489-Flights-Live-Pricing</a>
     * @param sessionKey the session key received on the {@link com.dazito.skyscannerclient.http.SkyScannerClient#createSession(SessionRequest)}
     * @return a {@link retrofit2.Response} containing the parsed JSON as a {@link com.dazito.skyscannerclient.data.polling.PollingResponse} received from SkyScanner.
     * @throws IOException
     */
    public Response<PollingResponse> pollSession(String sessionKey) throws IOException {
        Call<PollingResponse> call = service.pollSession(sessionKey, apiKey);
        return call.execute();
    }

    /**
     * Poll the session for results. @see <a href="https://support.business.skyscanner.net/hc/en-us/articles/211308489-Flights-Live-Pricing</a>
     * @param sessionKey the session key received on the {@link com.dazito.skyscannerclient.http.SkyScannerClient#createSession(SessionRequest)}
     * @param callback the {@link retrofit2.Callback} to process the response
     */
    public void pollSession(String sessionKey, Callback<PollingResponse> callback) {
        Call<PollingResponse> call =  service.pollSession(sessionKey, apiKey);
        call.enqueue(callback);
    }
}
