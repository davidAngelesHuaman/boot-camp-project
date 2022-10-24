package com.nttdata.bootcamp.ms.commons.base.domain;

import java.util.Arrays;

public enum StatusType {

    INACTIVE(0), ACTIVE(1);

    private final Integer code;

    StatusType(Integer code) {
        this.code = code;
    }

    public static StatusType getFromCodeOrNull(final Integer code) {
        return Arrays.stream(StatusType.values())
                .filter(e -> e.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }

    public Integer getCode() {
        return code;
    }
}
