package org.testcontainers.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.testcontainers.demo.domain.constant.ExternalTeams;
import org.testcontainers.demo.domain.constant.Priority;
import org.testcontainers.demo.domain.constant.Severity;
import org.testcontainers.demo.domain.constant.Status;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("ticket")
public class TicketDocument {

    @Id
    private String id;

    @Field(name = "external_id")
    private String externalId;

    @Field(name = "parent_external_id")
    private String parentExternalId;

    @Field(name = "customer_external_id")
    private Long customerExternalId;

    @Field(name = "customer")
    private String customerId;

    @Field(name = "subscription")
    private Long subscriptionId;

    @Field(name = "creator")
    private String creator;

    @Field(name = "name")
    private String name;

    @Field(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Field(name = "priority")
    private Priority priority;

    @Enumerated(EnumType.STRING)
    @Field(name = "severity")
    private Severity severity;

    @Field(name = "expected_resolution_date")
    private Date expectedResolutionDate;

    @Field(name = "requested_resolution_date")
    private Date requestedResolutionDate;

    @Field(name = "resolution_date")
    private Date resolutionDate;

    @Field(name = "resolution_time")
    private Long resolutionTime;

    @Field(name = "channel_id")
    private Long channelId;

    @Field(name = "external_team")
    private ExternalTeams externalTeam;

    @Field(name = "ticket_type")
    private String ticketTypeId;

    @Field(name = "trouble_ticket_relationships")
    private List<TicketRelationshipDocument> troubleTicketRelationships = new ArrayList<>();

    @Field(name = "related_party")
    private List<RelatedParty> relatedParty = new ArrayList<>();

    @Field(name = "assigned_user")
    private String assignedUser;

    @Field(name = "assigned_date")
    private Date assignedDate;

    @Field(name = "ticket_status")
    private Status ticketStatus;

    @Field(name = "status_change_date")
    private Date statusChangeDate;

    @Field(name = "problem_source")
    private Integer problemSource;

    @Field(name = "report_problem")
    private Integer reportProblem;

    @Field(name = "transaction_group")
    private Integer transactionGroup;

    @Field(name = "problem_caused")
    private Integer problemCaused;

    @Field(name = "comments")
    private List<Note> comments = new ArrayList<>();

    @Field(name = "conversations")
    private List<Note> conversations = new ArrayList<>();

    @Field(name = "legacy_transactions")
    private List<Note> legacyTransactions = new ArrayList<>();

    @Field(name = "related_entities")
    private List<RelatedEntity> relatedEntities = new ArrayList<>();

    @Field(name = "attachment_documents")
    private List<Attachment> attachments = new ArrayList<>();

    @Field("legacy_data")
    private LegacyData legacyData;

    @Field("is_legacy_notes_migrated")
    private Boolean isLegacyNotesMigrated;

    @Version
    private Long version;

    @Field(name = "created_date")
    @CreatedDate
    private Date createdDate;

    @Field(name = "last_modified_date")
    @LastModifiedDate
    private Date lastModifiedDate;

    public List<Attachment> getAttachments() {
        return Objects.requireNonNullElse(this.attachments, Collections.emptyList());
    }

    public List<Note> getComments() {
        return Objects.requireNonNullElse(this.comments, Collections.emptyList());
    }

    public void addComment(Note comment) {
        if (this.comments.isEmpty()) {
            this.comments = new ArrayList<>();
        }

        if (!containsCommentsWithSameExternalId(comment)) {
            this.comments.add(comment);
        }
    }

    public void addConversation(Note conversation) {
        if (this.conversations.isEmpty()) {
            this.conversations = new ArrayList<>();
        }

        if (!containsConversationsWithSameExternalId(conversation)) {
            this.conversations.add(conversation);
        }
    }

    public void addLegacyTransaction(Note legacyTransaction) {
        if (this.legacyTransactions.isEmpty()) {
            this.legacyTransactions = new ArrayList<>();
        }

        if (!containsLegacyTransactionWithSameExternalId(legacyTransaction)) {
            this.legacyTransactions.add(legacyTransaction);
        }
    }

    public void addTicketRelationships(TicketRelationshipDocument ticketRelationshipDocument) {
        if (Objects.isNull(this.troubleTicketRelationships) || this.troubleTicketRelationships.isEmpty()) {
            this.troubleTicketRelationships = new ArrayList<>();
        }
        this.troubleTicketRelationships.add(ticketRelationshipDocument);
    }

    public List<Note> getConversations() {
        return Objects.requireNonNullElse(this.conversations, Collections.emptyList());
    }

    public List<Note> getLegacyTransactions() {
        return Objects.requireNonNullElse(this.legacyTransactions, Collections.emptyList());
    }

    public Boolean getLegacyNotesMigrated() {
        return Objects.requireNonNullElse(this.isLegacyNotesMigrated, Boolean.FALSE);
    }

    private boolean containsLegacyTransactionWithSameExternalId(Note legacyTransaction) {
        return this.legacyTransactions.stream()
                .anyMatch(c -> c.getExternalId().equals(legacyTransaction.getExternalId()));
    }

    private boolean containsCommentsWithSameExternalId(Note comment) {
        return this.comments.stream()
                .anyMatch(c -> c.getExternalId().equals(comment.getExternalId()));
    }

    private boolean containsConversationsWithSameExternalId(Note conversation) {
        return this.conversations.stream()
                .anyMatch(c -> c.getExternalId().equals(conversation.getExternalId()));
    }

}
