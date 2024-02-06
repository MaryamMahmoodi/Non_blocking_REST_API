package com.project.nonblockingapi.controller;


import com.project.nonblockingapi.model.CombinedData;
import com.project.nonblockingapi.service.contract.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ApiController
{
    @Autowired
    private ApiService apiService;

    @GetMapping("/combinedData")
    public Mono<CombinedData> getCombinedData() {
        return apiService.fetchCombinedData();
    }
}
