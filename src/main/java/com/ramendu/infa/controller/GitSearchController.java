package com.ramendu.infa.controller;

import com.ramendu.infa.dto.GitProjects;
import com.ramendu.infa.service.GitSearchClientImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/search/project")
public class GitSearchController {

    private final GitSearchClientImpl searchClient;

    @GetMapping("/language/{languageName}/{pageNumber}")
    public ResponseEntity<GitProjects> getRepositoriesByLanguage(@PathVariable("languageName") String languageName,
                                                                 @PathVariable("pageNumber") Long pageNumber) {
        final GitProjects projects = searchClient.getAllProjectsByLanguage(languageName, pageNumber);
        return ResponseEntity.ok(projects);
    }

    @GetMapping("/user/{userName}/{languageName}")
    public ResponseEntity<GitProjects> getProjectsByLanguageAndUser(@PathVariable("userName") String userName,
                                                                    @PathVariable("languageName") String languageName) {
        final GitProjects projects = searchClient.getAllProjectsByLanguageAndUserName(languageName, userName);
        return ResponseEntity.ok(projects);
    }

    @GetMapping("/sorted/{languageName}/{pageNumber}/{sortingParameter}/{sortingStyle}")
    public ResponseEntity<GitProjects> getProjectsByLanguageSorted(@PathVariable("languageName") String languageName,
                                                                   @PathVariable("pageNumber") Long pageNumber,
                                                                   @PathVariable("sortingParameter") String sortingParameter,
                                                                   @PathVariable("sortingStyle") String sortingStyle) {
        final GitProjects projects =
                searchClient.getAllProjectsByLanguageSorted(languageName, pageNumber, sortingParameter, sortingStyle);
        return ResponseEntity.ok(projects);
    }
}