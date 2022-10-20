package com.nttdata.bootcamp.msdatabase.infraestructure;

import com.nttdata.bootcamp.msdatabase.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientRepository extends ReactiveMongoRepository<Client, String> {


}
