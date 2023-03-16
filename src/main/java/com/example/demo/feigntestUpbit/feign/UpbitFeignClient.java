package com.example.demo.feigntestUpbit.feign;

import com.example.demo.feigntest.client.Config;
import com.example.demo.feigntestUpbit.dto.UpBitTicker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "UpbitFeignClient", url = "https://api.upbit.com/v1/ticker", configuration = Config.class)
public interface UpbitFeignClient {

    @RequestMapping(method = RequestMethod.GET)
    List<UpBitTicker> getUpBitPriceList(@RequestParam(value = "markets") String markets);
}
