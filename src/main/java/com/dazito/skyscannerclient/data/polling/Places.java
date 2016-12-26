package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daz on 16/11/2016.
 */
public class Places {

    @SerializedName("Name")
    private final String name;
    @SerializedName("ParentId")
    private final String parentId;
    @SerializedName("Type")
    private final String type;
    @SerializedName("Id")
    private final String id;
    @SerializedName("Code")
    private final String code;

    public Places(String name, String parentId, String type, String id, String code) {
        this.name = name;
        this.parentId = parentId;
        this.type = type;
        this.id = id;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getParentId() {
        return parentId;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }
}
