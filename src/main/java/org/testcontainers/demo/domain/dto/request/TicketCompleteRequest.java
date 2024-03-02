package org.testcontainers.demo.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.testcontainers.demo.domain.constant.Status;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketCompleteRequest {

    @NotNull
    private Status status;
    private Long expectedResolutionDate;
    @NotNull
    private NoteRequest note;

}
