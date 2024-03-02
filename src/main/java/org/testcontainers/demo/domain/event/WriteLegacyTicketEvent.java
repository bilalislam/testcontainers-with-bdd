package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WriteLegacyTicketEvent implements Serializable {

    private static final long serialVersionUID = -8791515739798031655L;

    private String id;
    private String parentExternalId;
    private String customerId;
    private Long customerExternalId;
    private String description;
    private List<TicketNoteEvent> ticketNoteEvents;
    private Long resolutionDate;
    private Long subscriptionId;
    private Long createdDate;
    private Long lastModifiedDate;
}
