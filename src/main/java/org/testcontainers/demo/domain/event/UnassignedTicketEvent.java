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
public class UnassignedTicketEvent implements Serializable {

    private static final long serialVersionUID = -8791515739798031655L;

    private String id;
    private String externalId;
    private String parentExternalId;
    private String customerId;
    private Long customerExternalId;
    private String assignedUser;
}
