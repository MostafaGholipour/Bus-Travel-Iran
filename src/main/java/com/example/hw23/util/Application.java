package com.example.hw23.util;

import com.example.hw23.repository.bus.BusRepositoryImpl;
import com.example.hw23.service.bus.BusService;
import com.example.hw23.service.bus.BusServiceImpl;

public class Application {
      private static final   BusService busService= new BusServiceImpl(new BusRepositoryImpl());

        public static BusService AAA(){
            return busService;
        }

}
