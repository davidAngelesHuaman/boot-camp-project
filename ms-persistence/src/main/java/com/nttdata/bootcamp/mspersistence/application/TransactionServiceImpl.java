package com.nttdata.bootcamp.mspersistence.application;

import com.nttdata.bootcamp.ms.commons.base.domain.ClientDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class TransactionServiceImpl implements TransactionService {

    @Override
    public Mono<ClientDTO> create(ClientDTO clientDTO) {
        return null;
    }

    @Override
    public Mono<ClientDTO> findById(String code) {
        return null;
    }

    @Override
    public Flux<ClientDTO> listAll() {
        return null;
    }

    @Override
    public void update(ClientDTO clientDTO) {

    }

    @Override
    public void delete(String code) {

    }
}
