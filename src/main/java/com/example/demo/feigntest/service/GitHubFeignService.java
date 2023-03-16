package com.example.demo.feigntest.service;

import com.example.demo.feigntest.client.GitHubFeignClient;
import com.example.demo.feigntest.dto.Contributor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class GitHubFeignService {

    private final GitHubFeignClient gitHubFeignClient;

    public List<Contributor> getContributor(String owner, String repo) {
        List<Contributor> contributors = gitHubFeignClient.getContributor(owner, repo);
        return contributors;
    }

}