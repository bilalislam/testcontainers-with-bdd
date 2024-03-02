package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.AuthorType;
import org.testcontainers.demo.domain.constant.NoteType;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketNoteEvent implements Serializable {
    private static final long serialVersionUID = -2234225847439446481L;
    private String ticketId;
    private String ticketExternalId;
    private String noteId;
    private String noteExternalId;
    private String author;
    private String text;
    private AuthorType authorType;
    private NoteType noteType;
    private Long createdDate;
    private Long lastModifiedDate;
}
