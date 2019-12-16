package com.viv.mssc.service;

import com.viv.mssc.model.BeerData;
import com.viv.mssc.model.BeerStyleEnum;
import com.viv.mssc.util.BeerUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public List<BeerData> getBeers(Integer pageNum, Integer pageSize, String beerName,
                                   BeerStyleEnum beerStyle, boolean showInventoryOnHand) {
        //TODO : DB connection to fetch values
        //Create dummy value for now
        return BeerUtil.filterByName(beerName,DummtData.beerDatList);
    }
}
