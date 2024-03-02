package org.testcontainers.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;
import org.testcontainers.demo.domain.constant.RelationshipType;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketRelationshipDocument {

    @Field(name = "id")
    private String id;
    @Field(name = "href")
    private String href;
    @Field(name = "name")
    private String name;
    @Field(name = "relationshipType")
    private RelationshipType relationshipType;
    @Field(name = "created_date")
    @CreatedDate
    private Date createdDate;
    @Field(name = "last_modified_date")
    @LastModifiedDate
    private Date lastModifiedDate;

}
