package org.testcontainers.demo.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.NoteType;
import org.testcontainers.demo.domain.dto.NoteDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketNoteLegacyResponse {

    private NoteType type;
    private String externalId;
    private NoteDto note;

}
