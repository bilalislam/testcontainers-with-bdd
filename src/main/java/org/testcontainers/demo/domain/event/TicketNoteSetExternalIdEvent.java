package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.NoteType;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketNoteSetExternalIdEvent implements Serializable {

    private String ticketId;
    private String ticketExternalId;
    private NoteType noteType;
    private String ticketNoteId;
    private String ticketNoteExternalId;

}