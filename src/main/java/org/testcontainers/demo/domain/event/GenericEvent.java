package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.EventType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenericEvent<T> {

    private String transactionId;
    private EventType type;
    private Long publishTime;
    private T payload;
}
