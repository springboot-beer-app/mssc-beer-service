package com.viv.mssc.service;

import com.viv.mssc.model.BeerData;
import com.viv.mssc.model.BeerStyleEnum;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    public List<BeerData> getBeers(Integer pageNum, Integer pageSize, String beerName,
                                   BeerStyleEnum beerStyle, boolean showInventoryOnHand);

    public BeerData getBeerById(UUID uuid);
}
