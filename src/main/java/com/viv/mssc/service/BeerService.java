package com.viv.mssc.service;

import com.viv.mssc.model.BeerData;
import com.viv.mssc.model.BeerStyleEnum;

import java.util.List;

public interface BeerService {
    public List<BeerData> getBeers(Integer pageNum, Integer pageSize, String beerName,
                                   BeerStyleEnum beerStyle, boolean showInventoryOnHand);
}
