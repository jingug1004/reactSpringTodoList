package com.example.demo.feigntestUpbit.controller;

import com.example.demo.feigntestUpbit.service.UpbitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UpbitController {

    private final UpbitService upbitService;

    //특정 티커 조회
    @GetMapping(value = "/v1/upbit/{ticker}")
    public List<?> getUpbitTickerPrice(@PathVariable String ticker) {
        return upbitService.getUpbitPrice(ticker);
    }
}