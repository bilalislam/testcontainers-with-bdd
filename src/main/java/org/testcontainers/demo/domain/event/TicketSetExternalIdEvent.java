package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketSetExternalIdEvent implements Serializable {

    private String id;
    private Integer externalId;
    private Integer parentExternalId;
}
