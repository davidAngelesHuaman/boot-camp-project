package com.nttdata.bootcamp.ms.commons.base.domain;

import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

    private String id;
    private Integer type;
    private BigDecimal commission;
    private Integer movementCount;
    private Integer accountGroup;
    private StatusType status;

}
