package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daz on 16/11/2016.
 */
public class Query {

    @SerializedName("DestinationPlace")
    private final String destinationPlace;
    @SerializedName("OriginPlace")
    private final String originPlace;
    @SerializedName("Locale")
    private final String locale;
    @SerializedName("Adults")
    private final String adults;
    @SerializedName("Country")
    private final String country;
    @SerializedName("Children")
    private final String children;
    @SerializedName("InboundDate")
    private final String inboundDate;
    @SerializedName("OutboundDate")
    private final String outboundDate;
    @SerializedName("GroupPricing")
    private final String groupPricing;
    @SerializedName("CabinClass")
    private final String cabinClass;
    @SerializedName("Currency")
    private final String currency;
    @SerializedName("LocationScheam")
    private final String locationSchema;
    @SerializedName("Infants")
    private final String infants;

    public Query(String destinationPlace, String originPlace, String locale, String adults, String country,
                 String children, String inboundDate, String outboundDate, String groupPricing, String cabinClass,
                 String currency, String locationSchema, String infants) {
        this.destinationPlace = destinationPlace;
        this.originPlace = originPlace;
        this.locale = locale;
        this.adults = adults;
        this.country = country;
        this.children = children;
        this.inboundDate = inboundDate;
        this.outboundDate = outboundDate;
        this.groupPricing = groupPricing;
        this.cabinClass = cabinClass;
        this.currency = currency;
        this.locationSchema = locationSchema;
        this.infants = infants;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public String getLocale() {
        return locale;
    }

    public String getAdults() {
        return adults;
    }

    public String getCountry() {
        return country;
    }

    public String getChildren() {
        return children;
    }

    public String getInboundDate() {
        return inboundDate;
    }

    public String getOutboundDate() {
        return outboundDate;
    }

    public String getGroupPricing() {
        return groupPricing;
    }

    public String getCabinClass() {
        return cabinClass;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLocationSchema() {
        return locationSchema;
    }

    public String getInfants() {
        return infants;
    }
}
