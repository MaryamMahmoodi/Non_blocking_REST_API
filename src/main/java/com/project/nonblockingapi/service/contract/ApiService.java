package com.project.nonblockingapi.service.contract;

import com.project.nonblockingapi.model.CombinedData;
import reactor.core.publisher.Mono;


public interface ApiService
{
    Mono<CombinedData> fetchCombinedData();
}
