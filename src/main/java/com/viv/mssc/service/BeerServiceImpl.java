package com.viv.mssc.service;

import com.viv.mssc.model.BeerData;
import com.viv.mssc.model.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public List<BeerData> getBeers(Integer pageNum, Integer pageSize, String beerName,
                                   BeerStyleEnum beerStyle, boolean showInventoryOnHand) {
        //TODO : DB connection to fetch values
        //Create dummy value for now
        BeerData beerData = new BeerData().builder()
                .beerName("Dummy name")
                .beerStyleEnum(BeerStyleEnum.ALE)
                .creationDate(OffsetDateTime.now())
                .id(UUID.randomUUID())
                .lastModifiedDate(OffsetDateTime.now())
                .price(20.5f)
                .quantityOnHand(5)
                .upc("Dummy upc")
                .version(1)
                .build();
        return Collections.singletonList(beerData);
    }
}
