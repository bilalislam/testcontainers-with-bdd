package org.testcontainers.demo.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.Priority;
import org.testcontainers.demo.domain.constant.Severity;
import org.testcontainers.demo.domain.constant.Status;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketRequest {
    @Size(max = 60)
    private String externalId;
    private String creator;
    @NotBlank
    @Size(min = 8, max = 255)
    private String name;
    @NotBlank
    @Size(min = 8, max = 3000)
    private String description;
    @NotNull
    private Priority priority;
    @NotNull
    private Severity severity;
    private Long expectedResolutionDate;
    private Long requestedResolutionDate;
    @NotNull
    private Long channelId;
    @NotNull
    private String ticketTypeId;
    private List<TroubleTicketRelationshipRequest> troubleTicketRelationships;
    private List<RelatedPartyRequest> relatedParties;
    @NotBlank
    private String customerId;
    @NotNull
    private Long subscriptionId;
    @NotBlank
    @Size(min = 8, max = 60)
    private String assignedUser;
    @NotNull
    private Status ticketStatus;
    private List<RelatedEntityRequest> relatedEntities;

}
