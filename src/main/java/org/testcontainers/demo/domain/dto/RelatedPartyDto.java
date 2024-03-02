package org.testcontainers.demo.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testcontainers.demo.domain.constant.RelatedPartyRole;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedPartyDto implements Serializable {
    private static final long serialVersionUID = 7359727117707396503L;
    private String id;
    private RelatedPartyRole relatedPartyRole;
    private String name;
    private Long createdDate;
    private Long lastModifiedDate;
}
