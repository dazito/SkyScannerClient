package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daz on 16/11/2016.
 */
public class PricingOptions {

    @SerializedName("Agents")
    private final List<String> agents;
    @SerializedName("QuoteAgeInMinutes")
    private final String quoteAgeInMinutes;
    @SerializedName("DeeplinkUrl")
    private final String deeplinkUrl;
    @SerializedName("Price")
    private final String price;

    public PricingOptions(List<String> agents, String quoteAgeInMinutes, String deeplinkUrl, String price) {
        this.agents = agents;
        this.quoteAgeInMinutes = quoteAgeInMinutes;
        this.deeplinkUrl = deeplinkUrl;
        this.price = price;
    }

    public List<String> getAgents() {
        return agents;
    }

    public String getQuoteAgeInMinutes() {
        return quoteAgeInMinutes;
    }

    public String getDeeplinkUrl() {
        return deeplinkUrl;
    }

    public String getPrice() {
        return price;
    }
}
