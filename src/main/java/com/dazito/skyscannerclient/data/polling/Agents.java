package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daz on 16/11/2016.
 */
public class Agents {

    @SerializedName("Name")
    private final String name;
    @SerializedName("OptimisedForMobile")
    private final String optimisedForMobile;
    @SerializedName("Status")
    private final String status;
    @SerializedName("BookingNumber")
    private final String bookingNumber;
    @SerializedName("Type")
    private final String type;
    @SerializedName("ImageUrl")
    private final String imageUrl;
    @SerializedName("Id")
    private final String id;

    public Agents(String name, String optimisedForMobile, String status, String bookingNumber, String type,
                  String imageUrl, String id) {
        this.name = name;
        this.optimisedForMobile = optimisedForMobile;
        this.status = status;
        this.bookingNumber = bookingNumber;
        this.type = type;
        this.imageUrl = imageUrl;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getOptimisedForMobile() {
        return optimisedForMobile;
    }

    public String getStatus() {
        return status;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public String getType() {
        return type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getId() {
        return id;
    }
}
