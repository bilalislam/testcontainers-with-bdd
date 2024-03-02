package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.Severity;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DefinedTroubleTicketSeverityEvent {

    private String id;
    private Severity severity;

}
