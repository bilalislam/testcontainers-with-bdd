package org.testcontainers.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Attachment {
    @Field(name = "uuid")
    private String uuid;
    @Field(name = "attachmentType")
    private String attachmentType;
    @Field(name = "content")
    private String content;
    @Field(name = "description")
    private String description;
    @Field(name = "href")
    private String href;
    @Field(name = "mimeType")
    private String mimeType;
    @Field(name = "name")
    private String name;
    @Field(name = "size")
    private Integer size;
    @Field(name = "fileId")
    private String fileId;
    @Field(name = "is_active")
    private Boolean isActive;
    @Field(name = "created_date")
    @CreatedDate
    private Date createdDate;
    @Field(name = "last_modified_date")
    @LastModifiedDate
    private Date lastModifiedDate;
}
