package com.project.nonblockingapi.service.imp;

import com.project.nonblockingapi.model.CombinedData;
import com.project.nonblockingapi.model.Post;
import com.project.nonblockingapi.model.User;
import com.project.nonblockingapi.service.contract.ApiService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ApiServiceImpl implements ApiService
{

    private final WebClient webClient;

    public ApiServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://jsonplaceholder.typicode.com").build();
    }

    @Override
    public Mono<CombinedData> fetchCombinedData()
    {
        Mono<User> userMono = webClient.get().uri("/users/1").retrieve().bodyToMono(User.class);
        Mono<Post[]> postsMono = webClient.get().uri("/posts?userId=1").retrieve().bodyToMono(Post[].class);

        return Mono.zip(userMono, postsMono, CombinedData::new);
    }
}

