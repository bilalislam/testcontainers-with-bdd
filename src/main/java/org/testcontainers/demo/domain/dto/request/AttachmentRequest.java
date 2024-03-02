package org.testcontainers.demo.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentRequest {
    private String uuid;
    private String attachmentType;
    private String content;
    private String description;
    private String href;
    private String mimeType;
    private String name;
    private Integer size;
}