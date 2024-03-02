package org.testcontainers.demo.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.RelationshipType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketRelationshipRequest {
    @NotBlank
    private String id;
    private String href;
    private String name;
    @NotNull
    private RelationshipType relationshipType;
}
