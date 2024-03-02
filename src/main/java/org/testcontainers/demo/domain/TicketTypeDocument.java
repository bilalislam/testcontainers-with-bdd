package org.testcontainers.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class TicketTypeDocument {
    @Id
    private String id;
    @Field(name = "external_id")
    private Long externalId;
    @Field(name = "name")
    private String name;
    @Field(name = "group")
    private String group;
    @Field(name = "is_active")
    private Boolean isActive;
    @Field(name = "created_date")
    @CreatedDate
    private Date createdDate;
    @Field(name = "last_modified_date")
    @LastModifiedDate
    private Date lastModifiedDate;
}
