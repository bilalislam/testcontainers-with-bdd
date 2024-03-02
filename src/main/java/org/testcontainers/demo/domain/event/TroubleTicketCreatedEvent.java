package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.Priority;
import org.testcontainers.demo.domain.constant.Severity;
import org.testcontainers.demo.domain.constant.Status;
import org.testcontainers.demo.domain.dto.AttachmentDto;
import org.testcontainers.demo.domain.dto.LegacyDto;
import org.testcontainers.demo.domain.dto.NoteDto;
import org.testcontainers.demo.domain.dto.RelatedEntityDto;
import org.testcontainers.demo.domain.dto.RelatedPartyDto;
import org.testcontainers.demo.domain.dto.TroubleTicketRelationshipDto;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketCreatedEvent implements Serializable {
    private static final long serialVersionUID = -4690342875881789121L;
    private String id;
    private String externalId;
    private String parentExternalId;
    private String creator;
    private String name;
    private String description;
    private Priority priority;
    private Severity severity;
    private Long expectedResolutionDate;
    private Long requestedResolutionDate;
    private Long resolutionDate;
    private Long resolutionTime;
    private Long channelId;
    private String ticketTypeId;
    private List<TroubleTicketRelationshipDto> troubleTicketRelationships;
    private String assignedUser;
    private Long assignedDate;
    private Status ticketStatus;
    private List<NoteDto> comments;
    private List<NoteDto> conversations;
    private List<NoteDto> legacyTransactions;
    private List<RelatedEntityDto> relatedEntities;
    private List<AttachmentDto> attachmentDocuments;
    private List<RelatedPartyDto> relatedParties;
    private Long subscriptionId;
    private Long customerExternalId;
    private String customerId;
    private LegacyDto legacyDto;
    private Integer problemSource;
    private Integer reportProblem;
    private Integer transactionGroup;
    private Integer problemCaused;
    private Long createdDate;
    private Long lastModifiedDate;
}
