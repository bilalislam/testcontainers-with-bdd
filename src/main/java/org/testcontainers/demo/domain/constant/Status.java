package org.testcontainers.demo.domain.constant;

import lombok.Getter;

@Getter
public enum Status {
    ACKNOWLEDGE,
    REJECT,
    PENDING,
    POSTPONE,
    HELD,
    IN_PROGRESS,
    CANCELLED,
    CLOSED,
    RESOLVED
}
