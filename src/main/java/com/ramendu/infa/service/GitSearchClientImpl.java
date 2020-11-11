package com.ramendu.infa.service;

import com.ramendu.infa.dto.GitProjects;
import com.ramendu.infa.utils.UrlUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class GitSearchClientImpl implements GitSearchClient {

    private final UrlUtils urlUtils;
    private final RestTemplate restTemplate;

    @Override
    public GitProjects getAllProjectsByLanguage(String language,
                                                Long pageNumber) {
        final String url = urlUtils.searchUrlByLanguage(language, pageNumber);
        final ResponseEntity<GitProjects> response = restTemplate.getForEntity(url, GitProjects.class);
        return Objects.requireNonNull(response.getBody());
    }

    @Override
    public GitProjects getAllProjectsByLanguageAndUserName(String language,
                                                           String userName) {
        final String url = urlUtils.searchUrlByLanguageAndUser(language, userName);
        final ResponseEntity<GitProjects> response = restTemplate.getForEntity(url, GitProjects.class);
        return Objects.requireNonNull(response.getBody());
    }

    @Override
    public GitProjects getAllProjectsByLanguageSorted(String language,
                                                      Long pageNumber,
                                                      String sortingParameter,
                                                      String sortingStyle) {
        final String url = urlUtils.searchUrlByLanguageSorted(language, pageNumber, sortingParameter, sortingStyle);
        final ResponseEntity<GitProjects> response = restTemplate.getForEntity(url, GitProjects.class);
        return Objects.requireNonNull(response.getBody());
    }
}