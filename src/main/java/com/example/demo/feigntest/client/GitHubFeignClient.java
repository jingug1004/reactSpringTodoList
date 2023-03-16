package com.example.demo.feigntest.client;

import com.example.demo.feigntest.dto.Contributor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "feign", url = "https://api.github.com/repos", configuration = Config.class)
public interface GitHubFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/{owner}/{repo}/contributors")
    List<Contributor> getContributor(@PathVariable("owner") String owner, @PathVariable("repo") String repo);
}
