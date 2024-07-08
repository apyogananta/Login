package com.apyogananta.login;

import com.google.gson.annotations.SerializedName;

public class ForexRootModel {

    @SerializedName("rates")
    public ForexRatesModel ratesModel;

    public ForexRatesModel getRatesModel() { return ratesModel; }

    public ForexRootModel() {}

    public void setRatesModel(ForexRatesModel ratesModel) {
        this.ratesModel = ratesModel;
    }

}
