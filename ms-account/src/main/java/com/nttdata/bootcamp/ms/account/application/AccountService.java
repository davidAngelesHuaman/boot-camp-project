package com.nttdata.bootcamp.ms.account.application;

import org.springframework.web.reactive.function.server.ServerResponse;

import com.nttdata.bootcamp.ms.commons.base.domain.AccountDTO;  
import reactor.core.publisher.Mono;

public interface AccountService {

    Mono<AccountDTO> create(AccountDTO accountDTO);

    Mono<AccountDTO> associate(String id, Integer group);
    
    Mono<AccountDTO> cancel(String id);
    
    

}
