package com.example.demo.feigntest.controller;

import com.example.demo.feigntest.dto.Contributor;
import com.example.demo.feigntest.service.GitHubFeignService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * [springboot]Feign client 사용하기 - REST api 간편 호출
 * https://vmpo.tistory.com/109
 */

@Slf4j
@RestController
@RequiredArgsConstructor
public class GitHubFeignController {

    private final GitHubFeignService GitHubFeignService;

    @GetMapping(value = "/v1/github/{owner}/{repo}")
    public List<Contributor> getGitHubContributors(@PathVariable String owner, @PathVariable String repo) {
        return GitHubFeignService.getContributor(owner, repo);
    }
}