package org.testcontainers.demo.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachmentDto implements Serializable {
    private static final long serialVersionUID = -1086121215942770651L;
    private String uuid;
    private String attachmentType;
    private String content;
    private String description;
    private String href;
    private String mimeType;
    private String name;
    private Integer size;
    private Long createdDate;
    private Long lastModifiedDate;
}
