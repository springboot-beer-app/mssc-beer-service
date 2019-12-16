package com.viv.mssc.service;

import com.viv.mssc.model.BeerData;
import com.viv.mssc.model.BeerStyleEnum;

import java.time.OffsetDateTime;
import java.util.*;

public class DummtData {

    public static List<BeerData> beerDatList = new ArrayList<>();

    static {
        BeerData b1 = new BeerData().builder().beerName("TestBeer").beerStyleEnum(BeerStyleEnum.ALE)
                .creationDate(OffsetDateTime.now()).id(UUID.randomUUID()).lastModifiedDate(OffsetDateTime.now())
                .price(40.5f).quantityOnHand(5).upc("testUpc").version(1).build();

        BeerData b2 = new BeerData().builder().beerName("TestBeer2").beerStyleEnum(BeerStyleEnum.ALE)
                .creationDate(OffsetDateTime.now()).id(UUID.randomUUID()).lastModifiedDate(OffsetDateTime.now())
                .price(40.5f).quantityOnHand(5).upc("testUpc").version(1).build();

        beerDatList.add(b1);
        beerDatList.add(b2);
    }
}
