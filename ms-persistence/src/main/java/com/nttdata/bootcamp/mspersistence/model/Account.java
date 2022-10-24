package com.nttdata.bootcamp.mspersistence.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
@Getter
@Setter
public class Account {

    @Id
    private String id;
    private Integer type;
    private BigDecimal commission;
    private Integer movementCount;
    private Integer accountGroup;
    private Integer status;
    
}
