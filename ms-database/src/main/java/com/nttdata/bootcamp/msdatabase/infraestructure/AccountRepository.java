package com.nttdata.bootcamp.msdatabase.infraestructure;

import com.nttdata.bootcamp.msdatabase.model.Account; 
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountRepository extends ReactiveMongoRepository<Account, String> {


}
