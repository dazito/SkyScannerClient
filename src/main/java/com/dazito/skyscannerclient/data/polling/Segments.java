package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daz on 16/11/2016.
 */
public class Segments {

    @SerializedName("DepartureDateTime")
    private final String departureDateTime;
    @SerializedName("DestinationStation")
    private final String destinationStation;
    @SerializedName("Carrier")
    private final String carrier;
    @SerializedName("OriginStation")
    private final String originStation;
    @SerializedName("ArrivalDateTime")
    private final String arrivalDateTime;
    @SerializedName("JourneyMode")
    private final String journeyMode;
    @SerializedName("FlightNumber")
    private final String flightNumber;
    @SerializedName("Duration")
    private final String duration;
    @SerializedName("Directionality")
    private final String directionality;
    @SerializedName("OperatingCarrier")
    private final String operatingCarrier;
    @SerializedName("Id")
    private final String id;

    public Segments(String departureDateTime, String destinationStation, String carrier, String originStation,
                    String arrivalDateTime, String journeyMode, String flightNumber, String duration,
                    String directionality, String operatingCarrier, String id) {
        this.departureDateTime = departureDateTime;
        this.destinationStation = destinationStation;
        this.carrier = carrier;
        this.originStation = originStation;
        this.arrivalDateTime = arrivalDateTime;
        this.journeyMode = journeyMode;
        this.flightNumber = flightNumber;
        this.duration = duration;
        this.directionality = directionality;
        this.operatingCarrier = operatingCarrier;
        this.id = id;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getOriginStation() {
        return originStation;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public String getJourneyMode() {
        return journeyMode;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDuration() {
        return duration;
    }

    public String getDirectionality() {
        return directionality;
    }

    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    public String getId() {
        return id;
    }
}
