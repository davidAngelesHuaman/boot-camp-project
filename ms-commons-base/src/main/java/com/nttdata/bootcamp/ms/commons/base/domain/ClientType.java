package com.nttdata.bootcamp.ms.commons.base.domain;

import java.util.Arrays;

public enum ClientType {

    PERSONAL(1), BUSINESS(2);

    private final Integer code;

    ClientType(Integer code) {
        this.code = code;
    }

    public static ClientType getFromCodeOrNull(final Integer code) {
        return Arrays.stream(ClientType.values())
                .filter(e -> e.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }

    public Integer getCode() {
        return code;
    }
}
