package com.nttdata.bootcamp.mspersistence.application;

import com.nttdata.bootcamp.ms.commons.base.domain.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ClientDTO> create(@RequestBody ClientDTO clientDTO) {
        return clientService.create(clientDTO);
    }

    @GetMapping(value = "findById/{id}")
    public Mono<ClientDTO> findById(@PathVariable("id") String code) {
        return clientService.findById(code);
    }

    @GetMapping(value = "listAll", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ClientDTO> listAll() {
        return clientService.listAll();
    }

    @PostMapping("update")
    public void update(@RequestBody ClientDTO clientDTO) {
        clientService.update(clientDTO);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") String code) {
        clientService.delete(code);
    }


}
