package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.Status;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketCompleteEvent implements Serializable {
    private static final long serialVersionUID = -2881653863819929321L;
    private String ticketExternalId;
    private Status status;
    private Long expectedResolutionDate;
    private TicketNoteEvent note;
    private Long createdDate;
    private Long lastModifiedDate;
    private boolean autoClose;
}
