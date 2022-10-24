package com.nttdata.bootcamp.mspersistence.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document
@Getter
@Setter
public class Transaction {

    @Id
    private String id;
    private BigDecimal amount;
    /** Deposito, Retiro, Pago **/
    private Integer type;
    private Integer state;
    private Integer idAccount;
    private Integer idClientRegister;
    private LocalDate registerDate;



}
