package org.testcontainers.demo.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReplyEvent implements Serializable {
    private static final long serialVersionUID = -8791515739798031655L;
    private Integer externalId;
    private TicketNoteEvent note;
    private Integer problemSource;
    private Integer reportProblem;
    private Integer transactionGroup;
    private Integer problemCaused;
}
