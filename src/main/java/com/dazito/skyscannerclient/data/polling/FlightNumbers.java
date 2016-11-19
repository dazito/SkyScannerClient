package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daz on 16/11/2016.
 */
public class FlightNumbers {

    @SerializedName("FlightNumber")
    private final String flightNumber;
    @SerializedName("CarrierId")
    private final String carrierId;

    public FlightNumbers(String flightNumber, String carrierId) {
        this.flightNumber = flightNumber;
        this.carrierId = carrierId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getCarrierId() {
        return carrierId;
    }
}
