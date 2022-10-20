package com.nttdata.bootcamp.ms.account.application;
 
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.nttdata.bootcamp.ms.commons.base.domain.AccountDTO; 
 
import reactor.core.publisher.Mono; 

@Service
public class AccountServiceImpl implements AccountService {
	
	  WebClient client = WebClient.create("http://localhost:8082");
	 
	@Override
	public Mono<AccountDTO> create(AccountDTO accountDTO) { 
		  return client.post()
	                .uri("/account/create")
	                .body(Mono.just(accountDTO), AccountDTO.class)
	                .retrieve()
	                .bodyToMono(AccountDTO.class);
	}

	@Override
	public Mono<AccountDTO> cancel(String id) { 
        return client.get()
                .uri("/account/cancel/{id}", id)
                .retrieve()
                .bodyToMono(AccountDTO.class);
	}	
	
	@Override
	public Mono<AccountDTO> associate(String id, Integer group) { 
		   return client.get()
	                .uri("/account/associate/{id}/{group}", id, group)
	                .retrieve()
	                .bodyToMono(AccountDTO.class);
	} 
}
