package org.testcontainers.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;
import org.testcontainers.demo.domain.constant.AuthorType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Note {

    @Field(name = "id")
    private String id;
    @Field(name = "external_id")
    private String externalId;
    @Field(name = "author")
    private String author;
    @Field(name = "text")
    private String text;
    @Enumerated(EnumType.STRING)
    @Field(name = "author_type")
    private AuthorType authorType;
    @Field(name = "created_date")
    private Date createdDate;
    @Field(name = "last_modified_date")
    private Date lastModifiedDate;
}
