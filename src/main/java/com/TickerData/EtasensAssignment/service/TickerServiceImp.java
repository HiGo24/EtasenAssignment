package com.TickerData.EtasensAssignment.service;

import com.TickerData.EtasensAssignment.model.TickerMain;
import com.TickerData.EtasensAssignment.repository.TickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TickerServiceImp implements TickerService{





        @Autowired
        private TickerRepository tickerRepository;

    @Override
    public void saveTickerData(TickerMain tickerMain) {
        tickerRepository.save(tickerMain);
    }

        @Override
        public List<TickerMain> getAllTickerData() {
            return tickerRepository.findAll();
        }
    }

