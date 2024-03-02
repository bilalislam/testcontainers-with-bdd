package org.testcontainers.demo.domain.dto.response;

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
public class PageableResponse<T> implements Serializable {
    private List<T> data;
    private Long totalItems;
    private Integer totalPages;
    private Integer page;
}
