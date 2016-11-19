package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daz on 16/11/2016.
 */
public class Carriers {

    @SerializedName("Name")
    private final String name;
    @SerializedName("DisplayCode")
    private final String displayCode;
    @SerializedName("ImageUrl")
    private final String imageUrl;
    @SerializedName("Id")
    private final String id;
    @SerializedName("Code")
    private final String code;

    public Carriers(String name, String displayCode, String imageUrl, String id, String code) {
        this.name = name;
        this.displayCode = displayCode;
        this.imageUrl = imageUrl;
        this.id = id;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getDisplayCode() {
        return displayCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }
}
