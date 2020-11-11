package com.ramendu.infa.service;

import com.ramendu.infa.dto.GitProjects;

public interface GitSearchClient {
    GitProjects getAllProjectsByLanguage(String language, Long pageNumber);
    GitProjects getAllProjectsByLanguageAndUserName(String language, String userName);
    GitProjects getAllProjectsByLanguageSorted(String language, Long pageNumber, String sortingParameter, String sortingStyle);
}