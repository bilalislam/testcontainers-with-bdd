package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.ExternalTeams;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketTransferEvent implements Serializable {
    private static final long serialVersionUID = 7672698301588314865L;
    private Integer externalId;
    private TicketNoteEvent note;
    private ExternalTeams team;
    private Long createdDate;
}
