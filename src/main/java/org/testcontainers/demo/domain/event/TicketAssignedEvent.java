package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.Priority;
import org.testcontainers.demo.domain.constant.Status;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketAssignedEvent implements Serializable {
    private static final long serialVersionUID = 9183052187790905692L;
    private String id;
    private String externalId;
    private String customerId;
    private Long customerExternalId;
    private String name;
    private String description;
    private Priority priority;
    private Status status;
    private Long subscriptionId;
    private String assignedUser;
    private Long assignedDate;
    private String author;
    private Long createdDate;
    private Long lastModifiedDate;
    private Boolean writeToLegacy;
}
