package org.testcontainers.demo.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.testcontainers.demo.domain.constant.SortDirection;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTicketFilterRequest {
    @NotNull
    private Long customerId;
    @NotNull
    private Long startDate;
    @NotNull
    private Long endDate;
    @NotNull
    private Integer page;
    @NotNull
    @Min(1)
    private Integer size;
    @NotNull
    private SortDirection sortCreatedDate;
}
