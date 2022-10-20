package com.nttdata.bootcamp.mspersistence.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
public class Client {

    @Id
    private String id;
    private String name;
    private String lastName;
    private Integer type;
    private List<String> lstAccount;

}
