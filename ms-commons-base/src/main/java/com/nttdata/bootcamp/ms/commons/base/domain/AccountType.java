package com.nttdata.bootcamp.ms.commons.base.domain;

import java.util.Arrays;

public enum AccountType {

    SAVING(1, Boolean.FALSE),
    CURRENT(2, Boolean.FALSE),
    FIXED_TERM(3, Boolean.FALSE),
    PERSONAL(4, Boolean.TRUE),
    BUSINESS(5, Boolean.TRUE);

    private final Integer code;
    private final Boolean credit;

    AccountType(Integer code, Boolean credit) {
        this.code = code;
        this.credit = credit;
    }

    public static AccountType getFromCodeOrNull(final Integer code) {
        return Arrays.stream(AccountType.values())
                .filter(e -> e.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }

    public Integer getCode() {
        return code;
    }
}
