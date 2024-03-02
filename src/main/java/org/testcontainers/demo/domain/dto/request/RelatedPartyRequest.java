package org.testcontainers.demo.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.RelatedPartyRole;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RelatedPartyRequest {
    @NotBlank
    private String id;
    @NotBlank
    private String name;
    private RelatedPartyRole relatedPartyRole;
}
