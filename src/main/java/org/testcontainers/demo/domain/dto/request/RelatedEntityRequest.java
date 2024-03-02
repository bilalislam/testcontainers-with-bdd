package org.testcontainers.demo.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.testcontainers.demo.domain.constant.RelatedEntityRole;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RelatedEntityRequest {
    @NotBlank
    private String id;
    private String href;
    @NotBlank
    private String name;
    private RelatedEntityRole role;
}
