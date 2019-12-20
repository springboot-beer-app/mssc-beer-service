package com.viv.mssc.util;

import com.viv.mssc.model.BeerData;
import com.viv.mssc.service.DummyData;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BeerUtil {

    /**
     * Filter the beers based upon name
     * @param beerDataList
     */
    public static List<BeerData> filterByName(String name, List<BeerData> beerDataList){
        Stream<BeerData> beerDataStream = beerDataList.stream();
        return beerDataStream.filter(beerData -> {
           return beerData.getBeerName().equals(name);
        }).collect(Collectors.toList());
    }

    public static BeerData getBeerById(UUID uuid) {
        return DummyData.b1;
    }
}
