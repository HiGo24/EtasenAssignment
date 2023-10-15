package com.TickerData.EtasensAssignment.controler;

import com.TickerData.EtasensAssignment.model.TickerMain;
import com.TickerData.EtasensAssignment.service.TickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@RestController
//@RequestMapping("/tickerMain")
//@CrossOrigin

@RestController
@RequestMapping("/tickerMain")
@CrossOrigin
public class TickerControler {




        @Autowired
        private TickerService tickerService;

        @PostMapping("/add")
        public String add(@RequestBody TickerMain tickerMain){
            tickerService.saveTickerData(tickerMain);
            return "New Tickerdata is added";
        }

        @GetMapping("/getAll")
        public List<TickerMain> list(){
            return tickerService.getAllTickerData();
        }
    }


