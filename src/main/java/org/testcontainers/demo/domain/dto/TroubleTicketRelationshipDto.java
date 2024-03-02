package org.testcontainers.demo.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.testcontainers.demo.domain.constant.RelationshipType;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TroubleTicketRelationshipDto implements Serializable {
    private static final long serialVersionUID = -7044796688953376077L;
    private String id;
    private String href;
    private String name;
    private RelationshipType relationshipType;
    private Long createdDate;
    private Long lastModifiedDate;
}
