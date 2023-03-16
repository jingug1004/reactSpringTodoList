package com.example.demo.feigntestUpbit.service;

import com.example.demo.feigntestUpbit.dto.UpBitTicker;
import com.example.demo.feigntestUpbit.feign.UpbitFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UpbitService {

    private final UpbitFeignClient upbitFeignClient;

    public List<UpBitTicker> getUpbitPrice(String markets) {
        return upbitFeignClient.getUpBitPriceList(markets);
    }
}