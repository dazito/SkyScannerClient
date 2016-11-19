package com.dazito.skyscannerclient.data.polling;

import com.dazito.skyscannerclient.data.CarrierSchema;
import com.dazito.skyscannerclient.data.LocationSchema;
import com.dazito.skyscannerclient.data.SortType;

/**
 * Created by daz on 10/11/2016.
 */
public class PollingRequest {

    private final String apiKey;
    private final LocationSchema locationSchema;
    private final CarrierSchema carrierSchema;
    private final SortType sortType;
    private final String sortOrder; // ASC or DESC
    private final String originAirports;
    private final String destinationAirports;
    private final int stops;
    private final String outboundDepartTime;
    private final String outboundDepartStartTime;
    private final String outboundDepartendTime;
    private final String outboundArriveStartTime;
    private final String outboundArriveRndTime;
    private final String inboundDepartTime;
    private final String inboundDepartStartTime;
    private final String inboundDepartEndTime;
    private final String inboundArriveStartTime;
    private final String inboundArriveEndTime;
    private final int duration;
    private final String includeCarriers;
    private final String excludeCarriers;

    /**
     * Optional Parameters for Mobile Usage
     * The desired page number
     */
    private final int pageIndex;
    /**
     * Optional Parameters for Mobile Usage
     * The number of itineraries per page
     */
    private final int pagesize;
    /**
     * Optional Parameters for Mobile Usage
     * Whether or not to repeat the query in the poll session
     */
    private final boolean includeQuery;
    /**
     * Optional Parameters for Mobile Usage
     * A semicolon separated list of carried Ids which have already been sent to the client in this pricing session,
     * and hence will not be re-sent in subsequent polls
     */
    private final String skipCarrierLookup;
    /**
     * Optional Parameters for Mobile Usage
     * A semicolon separated list of place Ids which have already been sent to the client in this pricing session,
     * and hence will not be re-sent in subsequent polls
     */
    private final String skipPlaceLookup;
    /**
     * Optional Parameters for Mobile Usage
     * Whether or not to repeat the currency lookup information in the subsequent poll session
     */
    private final boolean includeCurrencyLookup;
    /**
     * Optional Parameters for Mobile Usage
     * Whether or not to show the BookingDetailsLink for each itinerary in the subsequent poll session.
     * If false, the client will have to build this booking details link manually
     *
     */
    private final boolean includeBookingDetailsLink;

    public PollingRequest(String apiKey, LocationSchema locationSchema, CarrierSchema carrierSchema, SortType sortType,
                          String sortOrder, String originAirports, String destinationAirports, int stops,
                          String outboundDepartTime, String outboundDepartStartTime, String outboundDepartendTime,
                          String outboundArriveStartTime, String outboundArriveRndTime, String inboundDepartTime,
                          String inboundDepartStartTime, String inboundDepartEndTime, String inboundArriveStartTime,
                          String inboundArriveEndTime, int duration, String includeCarriers, String excludeCarriers,
                          int pageIndex, int pagesize, boolean includeQuery, String skipCarrierLookup, String skipPlaceLookup,
                          boolean includeCurrencyLookup, boolean includeBookingDetailsLink) {

        this.apiKey = apiKey;
        this.locationSchema = locationSchema;
        this.carrierSchema = carrierSchema;
        this.sortType = sortType;
        this.sortOrder = sortOrder;
        this.originAirports = originAirports;
        this.destinationAirports = destinationAirports;
        this.stops = stops;
        this.outboundDepartTime = outboundDepartTime;
        this.outboundDepartStartTime = outboundDepartStartTime;
        this.outboundDepartendTime = outboundDepartendTime;
        this.outboundArriveStartTime = outboundArriveStartTime;
        this.outboundArriveRndTime = outboundArriveRndTime;
        this.inboundDepartTime = inboundDepartTime;
        this.inboundDepartStartTime = inboundDepartStartTime;
        this.inboundDepartEndTime = inboundDepartEndTime;
        this.inboundArriveStartTime = inboundArriveStartTime;
        this.inboundArriveEndTime = inboundArriveEndTime;
        this.duration = duration;
        this.includeCarriers = includeCarriers;
        this.excludeCarriers = excludeCarriers;
        this.pageIndex = pageIndex;
        this.pagesize = pagesize;
        this.includeQuery = includeQuery;
        this.skipCarrierLookup = skipCarrierLookup;
        this.skipPlaceLookup = skipPlaceLookup;
        this.includeCurrencyLookup = includeCurrencyLookup;
        this.includeBookingDetailsLink = includeBookingDetailsLink;
    }

    public static final class SearchRequestBuilder {
        private String apiKey;
        private LocationSchema locationSchema;
        private CarrierSchema carrierSchema;
        private SortType sortType;
        private String sortOrder; // ASC or DESC
        private String originAirports;
        private String destinationAirports;
        private int stops;
        private String outboundDepartTime;
        private String outboundDepartStartTime;
        private String outboundDepartendTime;
        private String outboundArriveStartTime;
        private String outboundArriveRndTime;
        private String inboundDepartTime;
        private String inboundDepartStartTime;
        private String inboundDepartEndTime;
        private String inboundArriveStartTime;
        private String inboundArriveEndTime;
        private int duration;
        private String includeCarriers;
        private String excludeCarriers;
        private int pageIndex;
        private int pagesize;
        private boolean includeQuery;
        private String skipCarrierLookup;
        private String skipPlaceLookup;
        private boolean includeCurrencyLookup;
        private boolean includeBookingDetailsLink;

        private SearchRequestBuilder() {
        }

        public static SearchRequestBuilder aSearchRequest() {
            return new SearchRequestBuilder();
        }

        public SearchRequestBuilder withApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public SearchRequestBuilder withLocationSchema(LocationSchema locationSchema) {
            this.locationSchema = locationSchema;
            return this;
        }

        public SearchRequestBuilder withCarrierSchema(CarrierSchema carrierSchema) {
            this.carrierSchema = carrierSchema;
            return this;
        }

        public SearchRequestBuilder withSortType(SortType sortType) {
            this.sortType = sortType;
            return this;
        }

        public SearchRequestBuilder withSortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        public SearchRequestBuilder withOriginAirports(String originAirports) {
            this.originAirports = originAirports;
            return this;
        }

        public SearchRequestBuilder withDestinationAirports(String destinationAirports) {
            this.destinationAirports = destinationAirports;
            return this;
        }

        public SearchRequestBuilder withStops(int stops) {
            this.stops = stops;
            return this;
        }

        public SearchRequestBuilder withOutboundDepartTime(String outboundDepartTime) {
            this.outboundDepartTime = outboundDepartTime;
            return this;
        }

        public SearchRequestBuilder withOutboundDepartStartTime(String outboundDepartStartTime) {
            this.outboundDepartStartTime = outboundDepartStartTime;
            return this;
        }

        public SearchRequestBuilder withOutboundDepartendTime(String outboundDepartendTime) {
            this.outboundDepartendTime = outboundDepartendTime;
            return this;
        }

        public SearchRequestBuilder withOutboundArriveStartTime(String outboundArriveStartTime) {
            this.outboundArriveStartTime = outboundArriveStartTime;
            return this;
        }

        public SearchRequestBuilder withOutboundArriveRndTime(String outboundArriveRndTime) {
            this.outboundArriveRndTime = outboundArriveRndTime;
            return this;
        }

        public SearchRequestBuilder withInboundDepartTime(String inboundDepartTime) {
            this.inboundDepartTime = inboundDepartTime;
            return this;
        }

        public SearchRequestBuilder withInboundDepartStartTime(String inboundDepartStartTime) {
            this.inboundDepartStartTime = inboundDepartStartTime;
            return this;
        }

        public SearchRequestBuilder withInboundDepartEndTime(String inboundDepartEndTime) {
            this.inboundDepartEndTime = inboundDepartEndTime;
            return this;
        }

        public SearchRequestBuilder withInboundArriveStartTime(String inboundArriveStartTime) {
            this.inboundArriveStartTime = inboundArriveStartTime;
            return this;
        }

        public SearchRequestBuilder withInboundArriveEndTime(String inboundArriveEndTime) {
            this.inboundArriveEndTime = inboundArriveEndTime;
            return this;
        }

        public SearchRequestBuilder withDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public SearchRequestBuilder withIncludeCarriers(String includeCarriers) {
            this.includeCarriers = includeCarriers;
            return this;
        }

        public SearchRequestBuilder withExcludeCarriers(String excludeCarriers) {
            this.excludeCarriers = excludeCarriers;
            return this;
        }

        public SearchRequestBuilder withPageIndex(int pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        public SearchRequestBuilder withPagesize(int pagesize) {
            this.pagesize = pagesize;
            return this;
        }

        public SearchRequestBuilder withIncludeQuery(boolean includeQuery) {
            this.includeQuery = includeQuery;
            return this;
        }

        public SearchRequestBuilder withSkipCarrierLookup(String skipCarrierLookup) {
            this.skipCarrierLookup = skipCarrierLookup;
            return this;
        }

        public SearchRequestBuilder withSkipPlaceLookup(String skipPlaceLookup) {
            this.skipPlaceLookup = skipPlaceLookup;
            return this;
        }

        public SearchRequestBuilder withIncludeCurrencyLookup(boolean includeCurrencyLookup) {
            this.includeCurrencyLookup = includeCurrencyLookup;
            return this;
        }

        public SearchRequestBuilder withIncludeBookingDetailsLink(boolean includeBookingDetailsLink) {
            this.includeBookingDetailsLink = includeBookingDetailsLink;
            return this;
        }

        public PollingRequest build() {
            PollingRequest pollingRequest = new PollingRequest(apiKey, locationSchema, carrierSchema, sortType, sortOrder,
                    originAirports, destinationAirports, stops, outboundDepartTime, outboundDepartStartTime,
                    outboundDepartendTime, outboundArriveStartTime, outboundArriveRndTime, inboundDepartTime,
                    inboundDepartStartTime, inboundDepartEndTime, inboundArriveStartTime, inboundArriveEndTime,
                    duration, includeCarriers, excludeCarriers, pageIndex, pagesize, includeQuery, skipCarrierLookup,
                    skipPlaceLookup, includeCurrencyLookup, includeBookingDetailsLink);

            return pollingRequest;
        }
    }
}
