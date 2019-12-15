package com.viv.mssc.controller;

import com.viv.mssc.model.BeerData;
import com.viv.mssc.model.BeerStyleEnum;
import com.viv.mssc.service.BeerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/beer")
public class MSSCBeerController {

    private BeerService beerService;

    @GetMapping
    public List<BeerData> getBeer(Integer pageNum, Integer pageSize, String beerName,
                                  BeerStyleEnum beerStyle, boolean showInventoryOnHand) {
        return null;
    }

}
