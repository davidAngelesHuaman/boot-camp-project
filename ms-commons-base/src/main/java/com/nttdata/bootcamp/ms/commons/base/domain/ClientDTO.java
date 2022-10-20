package com.nttdata.bootcamp.ms.commons.base.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDTO {

    private String id;
    private String name;
    private String lastName;
    private ClientType type;
    private List<AccountDTO> lstAccount;

}
