package org.testcontainers.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketPageableDto implements Serializable {
    private static final long serialVersionUID = 4940708480124692805L;
    private Long itemCount;
    private List<TroubleTicketDto> troubleTickets;

}
