package com.nttdata.bootcamp.ms.commons.base.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter; 
import java.math.BigDecimal;
import java.util.List; 
 

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
    private Boolean status;

}
