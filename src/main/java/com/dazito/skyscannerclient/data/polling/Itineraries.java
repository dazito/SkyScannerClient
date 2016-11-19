package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daz on 16/11/2016.
 */
public class Itineraries {
    @SerializedName("PricingOptions")
    private final List<PricingOptions> pricingOptions;
    @SerializedName("InboundLegId")
    private final String inboundLegId;
    @SerializedName("BookingDetailsLink")
    private final BookingDetailsLink bookingDetailsLink;
    @SerializedName("OutboundLegId")
    private final String outboundLegId;

    public Itineraries(List<PricingOptions> pricingOptions, String inboundLegId, BookingDetailsLink bookingDetailsLink, String outboundLegId) {
        this.pricingOptions = pricingOptions;
        this.inboundLegId = inboundLegId;
        this.bookingDetailsLink = bookingDetailsLink;
        this.outboundLegId = outboundLegId;
    }

    public List<PricingOptions> getPricingOptions() {
        return pricingOptions;
    }

    public String getInboundLegId() {
        return inboundLegId;
    }

    public BookingDetailsLink getBookingDetailsLink() {
        return bookingDetailsLink;
    }

    public String getOutboundLegId() {
        return outboundLegId;
    }
}
