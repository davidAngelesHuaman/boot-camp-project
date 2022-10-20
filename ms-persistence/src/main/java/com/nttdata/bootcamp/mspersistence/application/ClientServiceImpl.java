package com.nttdata.bootcamp.mspersistence.application;

import com.nttdata.bootcamp.ms.commons.base.domain.AccountDTO;
import com.nttdata.bootcamp.ms.commons.base.domain.ClientDTO;
import com.nttdata.bootcamp.ms.commons.base.domain.ClientType;
import com.nttdata.bootcamp.mspersistence.infraestructure.ClientRepository;
import com.nttdata.bootcamp.mspersistence.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;
    
    @Override
    public Mono<ClientDTO> create(ClientDTO clientDTO) {
        return Mono.just(this.toDto(clientDTO))
                .flatMap(clientRepository::insert).map(p -> toDto(p));
    }
    @Override
    public Mono<ClientDTO> findById(String code){
        return clientRepository.findById(code).map(p -> toDto(p));
    }

    @Override
    public Flux<ClientDTO> listAll() {
        return clientRepository.findAll()
                .flatMap(p -> Flux.just(toDto(p)));
    }

    @Override
    public void update(ClientDTO clientDTO){
        clientRepository.save(this.toDto(clientDTO));
    }

    @Override
    public void delete(String code){
        clientRepository.deleteById(code);
    }

    private ClientDTO toDto(Client client) {
        return ClientDTO.builder()
                .id(client.getId())
                .name(client.getName())
                .type(ClientType.getFromCodeOrNull(client.getType()))
                .lastName(client.getLastName())
                .build();
    }

    private Client toDto(ClientDTO clientDTO) {
        Client client = new Client();
        client.setId(clientDTO.getId());
        client.setName(clientDTO.getName());
        client.setLastName(clientDTO.getLastName());
        client.setType(clientDTO.getType().getCode());

        if (clientDTO.getLstAccount() != null) {
            client.setLstAccount(clientDTO.getLstAccount().stream().map(AccountDTO::getId).collect(Collectors.toList()));
        }
        return client;
    }
}
