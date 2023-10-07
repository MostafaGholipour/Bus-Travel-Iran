package com.example.BusTravelIran.util;

import com.example.BusTravelIran.repository.bus.BusRepositoryImpl;
import com.example.BusTravelIran.service.bus.BusService;
import com.example.BusTravelIran.service.bus.BusServiceImpl;

public class Application {
      private static final   BusService busService= new BusServiceImpl(new BusRepositoryImpl());

        public static BusService AAA(){
            return busService;
        }

}
