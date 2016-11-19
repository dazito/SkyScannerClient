package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daz on 16/11/2016.
 */
public class PollingResponse {
    @SerializedName("Agents")
    private final List<Agents> agents;
    @SerializedName("Status")
    private final String status;
    @SerializedName("Currencies")
    private final List<Currencies> currencies;
    @SerializedName("Places")
    private final List<Places> places;
    @SerializedName("Itineraries")
    private final List<Itineraries> itineraries;
    @SerializedName("Carriers")
    private final List<Carriers> carriers;
    @SerializedName("SessionKey")
    private final String sessionKey;
    @SerializedName("Query")
    private final Query query;
    @SerializedName("Segments")
    private final List<Segments> segments;
    @SerializedName("Legs")
    private final List<Legs> legs;

    public PollingResponse(List<Agents> agents, String status, List<Currencies> currencies, List<Places> places,
                           List<Itineraries> itineraries, List<Carriers> carriers, String sessionKey, Query query,
                           List<Segments> segments, List<Legs> legs) {
        this.agents = agents;
        this.status = status;
        this.currencies = currencies;
        this.places = places;
        this.itineraries = itineraries;
        this.carriers = carriers;
        this.sessionKey = sessionKey;
        this.query = query;
        this.segments = segments;
        this.legs = legs;
    }

    public List<Agents> getAgents() {
        return agents;
    }

    public String getStatus() {
        return status;
    }

    public List<Currencies> getCurrencies() {
        return currencies;
    }

    public List<Places> getPlaces() {
        return places;
    }

    public List<Itineraries> getItineraries() {
        return itineraries;
    }

    public List<Carriers> getCarriers() {
        return carriers;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public Query getQuery() {
        return query;
    }

    public List<Segments> getSegments() {
        return segments;
    }

    public List<Legs> getLegs() {
        return legs;
    }
}
