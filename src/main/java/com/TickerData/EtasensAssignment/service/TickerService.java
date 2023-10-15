package com.TickerData.EtasensAssignment.service;
import com.TickerData.EtasensAssignment.model.TickerMain;

import java.util.List;



public interface TickerService {
    public void saveTickerData(TickerMain tickerMain);
    public List<TickerMain> getAllTickerData();
}