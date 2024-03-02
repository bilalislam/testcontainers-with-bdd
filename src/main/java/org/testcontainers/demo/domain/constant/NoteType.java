package org.testcontainers.demo.domain.constant;

import lombok.Getter;

@Getter
public enum NoteType {
    COMMENT,
    CONVERSATION,
    LEGACY_TRANSACTION
}
