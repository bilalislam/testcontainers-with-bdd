package org.testcontainers.demo.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.testcontainers.demo.domain.constant.Priority;
import org.testcontainers.demo.domain.constant.Severity;
import org.testcontainers.demo.domain.constant.Status;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TroubleTicketDto implements Serializable {
    private static final long serialVersionUID = 5448214804571859039L;

    private String id;
    private String externalId;
    private String parentExternalId;
    private String creator;
    private Long customerExternalId;
    private String customerId;
    private Long subscriptionId;
    private String name;
    private String description;
    private String assignedUser;
    private Long assignedDate;
    /* Do not use MVP and Legacy System */
    private Long expectedResolutionDate;
    /* Do not use MVP and Legacy System */
    private Long requestedResolutionDate;
    private Long resolutionDate;
    private Long resolutionTime;
    private Long channelId;
    private String ticketTypeId;
    private Priority priority;
    private Severity severity;
    private Integer legacyPriority;
    private Status status;
    private Integer problemSource;
    private Integer reportProblem;
    private Integer transactionGroup;
    private Integer problemCaused;
    private List<TroubleTicketRelationshipDto> troubleTicketRelationships;
    private List<RelatedEntityDto> relatedEntities;
    private List<AttachmentDto> attachmentDocuments;
    private List<RelatedPartyDto> relatedParties;
    private Long createdDate;
    private Long lastModifiedDate;
}
