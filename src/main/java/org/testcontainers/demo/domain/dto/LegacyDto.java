package org.testcontainers.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LegacyDto implements Serializable {

    private Integer os;
    private Integer wb;
    private String eventType;
    private Integer priority;
    private String readOnly;
    private Integer finalized;
    private String processSequence;

}
