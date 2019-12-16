package com.viv.mssc.util;

import com.viv.mssc.model.BeerData;

import java.util.List;
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
}
