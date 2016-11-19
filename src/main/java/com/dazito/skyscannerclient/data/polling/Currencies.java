package com.dazito.skyscannerclient.data.polling;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daz on 16/11/2016.
 */
public class Currencies {

    @SerializedName("decimalDigits")
    private final String decimalDigits;
    @SerializedName("symbol")
    private final String symbol;
    @SerializedName("symbolOnLeft")
    private final String symbolOnLeft;
    @SerializedName("decimalSeparator")
    private final String decimalSeparator;
    @SerializedName("roundingCoefficient")
    private final String roundingCoefficient;
    @SerializedName("thousandsSeparator")
    private final String thousandsSeparator;
    @SerializedName("code")
    private final String code;
    @SerializedName("spaceBetweenAmountAndSymbol")
    private final String spaceBetweenAmountAndSymbol;

    public Currencies(String decimalDigits, String symbol, String symbolOnLeft, String decimalSeparator,
                      String roundingCoefficient, String thousandsSeparator, String code,
                      String spaceBetweenAmountAndSymbol) {
        this.decimalDigits = decimalDigits;
        this.symbol = symbol;
        this.symbolOnLeft = symbolOnLeft;
        this.decimalSeparator = decimalSeparator;
        this.roundingCoefficient = roundingCoefficient;
        this.thousandsSeparator = thousandsSeparator;
        this.code = code;
        this.spaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol;
    }

    public String getDecimalDigits() {
        return decimalDigits;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSymbolOnLeft() {
        return symbolOnLeft;
    }

    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    public String getRoundingCoefficient() {
        return roundingCoefficient;
    }

    public String getThousandsSeparator() {
        return thousandsSeparator;
    }

    public String getCode() {
        return code;
    }

    public String getSpaceBetweenAmountAndSymbol() {
        return spaceBetweenAmountAndSymbol;
    }
}
