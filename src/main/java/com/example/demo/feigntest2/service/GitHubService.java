package com.example.demo.feigntest2.service;

import com.example.demo.feigntest.dto.Contributor;
import com.example.demo.feigntest2.client.GitHubClient;
import com.example.demo.feigntest2.dto.Issue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GitHubService {

    @Autowired
    private GitHubClient gitHubClient;

    public List<Contributor> getGitHubContributors(String owner, String repo) {
        log.info("==================================tag01=====================================");
        log.info(String.valueOf(gitHubClient.getClass().hashCode()));

        return gitHubClient.contributors(owner, repo);
    }

    public List<Issue> getGitHubIssues(String owner, String repo) {
        log.info("==================================tag02=====================================");
        log.info(String.valueOf(gitHubClient.getClass().hashCode()));
        return gitHubClient.getIssues(owner, repo);
    }

}