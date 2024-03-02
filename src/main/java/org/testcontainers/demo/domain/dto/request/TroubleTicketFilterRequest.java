package org.testcontainers.demo.domain.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.testcontainers.demo.domain.constant.SortDirection;
import org.testcontainers.demo.domain.constant.Status;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketFilterRequest {
    @NotEmpty
    private List<String> userNames;
    @NotNull
    private Long startDate;
    @NotNull
    private Long endDate;
    @NotNull
    private Integer page;
    @NotNull
    @Min(1)
    private Integer size;
    private String keyword;
    @NotEmpty
    private List<Status> statusTypes;
    @NotNull
    private Long minSolutionTime;
    @NotNull
    private Long maxSolutionTime;
    @NotNull
    SortDirection sortCreatedDate;

}
