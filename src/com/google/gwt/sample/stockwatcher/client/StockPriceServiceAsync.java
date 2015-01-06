package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.sample.stockwatcher.client.StockPrice;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;

public interface StockPriceServiceAsync {
    void getPrices(String[] symbols, AsyncCallback<StockPrice[]> async);
}
