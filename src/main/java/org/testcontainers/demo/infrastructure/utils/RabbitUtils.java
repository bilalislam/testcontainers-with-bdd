package org.testcontainers.demo.infrastructure.utils;

import org.springframework.amqp.core.Message;

import java.util.List;
import java.util.Map;

public final class RabbitUtils {

    private static final String X_DEATH_HEADER = "x-death";

    private RabbitUtils() {
        throw new IllegalStateException("Utility Class");
    }

    public static int getXDeathCountFromHeader(Message message) {
        Map<String, Object> headers = message.getMessageProperties().getHeaders();
        if (!headers.containsKey(X_DEATH_HEADER)) {
            return 0;
        }

        List<Map<String, Object>> xDeath = (List<Map<String, Object>>) headers.get(X_DEATH_HEADER);
        Long count = (Long) xDeath.get(0).get("count");
        return count.intValue();
    }
}