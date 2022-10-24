package com.nttdata.bootcamp.mspersistence.application;

import com.nttdata.bootcamp.ms.commons.base.domain.ClientDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionService {

    Mono<ClientDTO> create(ClientDTO clientDTO);

    Mono<ClientDTO> findById(String code);

    Flux<ClientDTO> listAll();

    void update(ClientDTO clientDTO);

    void delete(String code);

}
