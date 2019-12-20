package com.viv.mssc.controller;

import com.viv.mssc.model.BeerData;
import com.viv.mssc.model.BeerStyleEnum;
import com.viv.mssc.service.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class MSSCBeerController {

    private BeerService beerService;

    public MSSCBeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    //TODO : In spring @QueryParam equivalent is @RequestParam
    @GetMapping
    public ResponseEntity<List<BeerData>> getBeer(@RequestParam("pageNumber") Integer pageNum, @RequestParam Integer pageSize,
                                                 @RequestParam String beerName, BeerStyleEnum beerStyle,
                                                 @RequestParam boolean showInventoryOnHand) {
        return new ResponseEntity<>(beerService.getBeers(pageNum,pageSize,beerName,beerStyle,
                showInventoryOnHand), HttpStatus.OK);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<BeerData> getByID(@PathVariable("id") UUID uuid) {
        return new ResponseEntity<>(beerService.getBeerById(uuid),HttpStatus.OK);
    }

}
