package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daz on 16/11/2016.
 */
public class Legs {

    @SerializedName("Stops")
    private final List<String> stops;
    @SerializedName("DestinationStation")
    private final String destinationStation;
    @SerializedName("Departure")
    private final String departure;
    @SerializedName("OriginStation")
    private final String originStation;
    @SerializedName("OperationCarriers")
    private final List<String> operatingCarriers;
    @SerializedName("Carriers")
    private final List<String> carriers;
    @SerializedName("SegmentIds")
    private final List<String> segmentIds;
    @SerializedName("JourneyMode")
    private final String journeyMode;
    @SerializedName("Duration")
    private final String duration;
    @SerializedName("Directionality")
    private final String directionality;
    @SerializedName("Arrival")
    private final String arrival;
    @SerializedName("Id")
    private final String id;
    @SerializedName("FlightNumbers")
    private final List<FlightNumbers> flightNumbers;

    public Legs(List<String> stops, String destinationStation, String departure, String originStation,
                List<String> operatingCarriers, List<String> carriers, List<String> segmentIds, String journeyMode,
                String duration, String directionality, String arrival, String id, List<FlightNumbers> flightNumbers) {
        this.stops = stops;
        this.destinationStation = destinationStation;
        this.departure = departure;
        this.originStation = originStation;
        this.operatingCarriers = operatingCarriers;
        this.carriers = carriers;
        this.segmentIds = segmentIds;
        this.journeyMode = journeyMode;
        this.duration = duration;
        this.directionality = directionality;
        this.arrival = arrival;
        this.id = id;
        this.flightNumbers = flightNumbers;
    }

    public List<String> getStops() {
        return stops;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public String getDeparture() {
        return departure;
    }

    public String getOriginStation() {
        return originStation;
    }

    public List<String> getOperatingCarriers() {
        return operatingCarriers;
    }

    public List<String> getCarriers() {
        return carriers;
    }

    public List<String> getSegmentIds() {
        return segmentIds;
    }

    public String getJourneyMode() {
        return journeyMode;
    }

    public String getDuration() {
        return duration;
    }

    public String getDirectionality() {
        return directionality;
    }

    public String getArrival() {
        return arrival;
    }

    public String getId() {
        return id;
    }

    public List<FlightNumbers> getFlightNumbers() {
        return flightNumbers;
    }
}
