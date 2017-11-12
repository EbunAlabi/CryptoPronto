package com.example.hp.cryptonow.api;

import com.example.hp.cryptonow.model.CryptoCompare;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hp on 11/12/2017.
 */

public interface APIService {

    //getting latest currency exchange rates
    @GET("pricemulti?fsyms=ETH,BTC&tsyms=NGN,KES,USD,GBP,CNY,CHF,EUR,MXN,GLD,JOD,OMR,BHD,KWD,JPY,CAD,AED,CLP,BRL,INR,ILS")
    Call<CryptoCompare> getLatestExchangeRates();

}
