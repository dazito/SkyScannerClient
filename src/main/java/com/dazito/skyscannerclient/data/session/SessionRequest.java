/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dazito.skyscannerclient.data.session;

import com.dazito.skyscannerclient.data.LocationSchema;

/**
 *
 * @author daz
 */
public class SessionRequest {

    private final String country;
    private final String currency;
    private final String locale;
    private final String originPlace;
    private final String destinationPlace;
    private final String outboundDate; // Date Formatted as YYYY-mm-dd
    private final String inboundDate; //	Date	Formatted as YYYY-mm-dd
    private final LocationSchema locationSchema;
    private final String cabinClass;
    private final int adults; // Defaults to 1 if not specified. Maximum 8
    private final int children; // Defaults to 0, maximum 8
    private final int infants; // Defaults to 0, cannot exceed adults
    private final boolean groupPricing; // Defaults to false


    public SessionRequest(String country, String currency, String locale, String originPlace,
                          String destinationPlace, String outboundDate, String inboundDate, LocationSchema locationSchema,
                          String cabinClass, int adults, int children, int infants, boolean groupPricing) {
        this.country = country;
        this.currency = currency;
        this.locale = locale;
        this.originPlace = originPlace;
        this.destinationPlace = destinationPlace;
        this.outboundDate = outboundDate;
        this.inboundDate = inboundDate;
        this.locationSchema = locationSchema;
        this.cabinClass = cabinClass;
        this.adults = adults;
        this.children = children;
        this.infants = infants;
        this.groupPricing = groupPricing;
    }


    public static final class SessionRequestBuilder {
        private String country;
        private String currency;
        private String locale;
        private String originPlace;
        private String destinationPlace;
        private String outboundDate; // Date Formatted as YYYY-mm-dd
        private String inboundDate; //	Date	Formatted as YYYY-mm-dd
        private LocationSchema locationSchema;
        private String cabinClass;
        private int adults; // Defaults to 1 if not specified. Maximum 8
        private int children; // Defaults to 0, maximum 8
        private int infants; // Defaults to 0, cannot exceed adults
        private boolean groupPricing; // Defaults to false

        private SessionRequestBuilder() {
        }

        public static SessionRequestBuilder aSessionRequest() {
            return new SessionRequestBuilder();
        }

        public SessionRequestBuilder withCountry(String country) {
            this.country = country;
            return this;
        }

        public SessionRequestBuilder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public SessionRequestBuilder withLocale(String locale) {
            this.locale = locale;
            return this;
        }

        public SessionRequestBuilder withOriginPlace(String originPlace) {
            this.originPlace = originPlace;
            return this;
        }

        public SessionRequestBuilder withDestinationPlace(String destinationPlace) {
            this.destinationPlace = destinationPlace;
            return this;
        }

        /**
         *
         * @param outboundDate Date Formatted as YYYY-mm-dd
         * @return
         */
        public SessionRequestBuilder withOutboundDate(String outboundDate) {
            this.outboundDate = outboundDate;
            return this;
        }

        /**
         *
         * @param inboundDate Date Formatted as YYYY-mm-dd
         * @return
         */
        public SessionRequestBuilder withInboundDate(String inboundDate) {
            this.inboundDate = inboundDate;
            return this;
        }

        public SessionRequestBuilder withLocationSchema(LocationSchema locationSchema) {
            this.locationSchema = locationSchema;
            return this;
        }

        public SessionRequestBuilder withCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }

        public SessionRequestBuilder withAdults(int adults) {
            this.adults = adults;
            return this;
        }

        public SessionRequestBuilder withChildren(int children) {
            this.children = children;
            return this;
        }

        public SessionRequestBuilder withInfants(int infants) {
            this.infants = infants;
            return this;
        }

        public SessionRequestBuilder withGroupPricing(boolean groupPricing) {
            this.groupPricing = groupPricing;
            return this;
        }

        public SessionRequest build() {
            SessionRequest sessionRequest = new SessionRequest(country, currency, locale, originPlace,
                    destinationPlace, outboundDate, inboundDate, locationSchema, cabinClass, adults, children,
                    infants, groupPricing);

            return sessionRequest;
        }
    }

    public String getCountry() {
        return country;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLocale() {
        return locale;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    public String getOutboundDate() {
        return outboundDate;
    }

    public String getInboundDate() {
        return inboundDate;
    }

    public LocationSchema getLocationSchema() {
        return locationSchema;
    }

    public String getCabinClass() {
        return cabinClass;
    }

    public int getAdults() {
        return adults;
    }

    public int getChildren() {
        return children;
    }

    public int getInfants() {
        return infants;
    }

    public boolean isGroupPricing() {
        return groupPricing;
    }
}
