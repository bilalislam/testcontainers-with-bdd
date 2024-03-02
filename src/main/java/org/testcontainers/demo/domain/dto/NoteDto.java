package org.testcontainers.demo.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.testcontainers.demo.domain.constant.AuthorType;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteDto implements Serializable {
    private static final long serialVersionUID = 942847635037102749L;

    private String externalId;
    private String author;
    private String text;
    private Boolean visibility;
    private AuthorType authorType;
    private Long createdDate;
    private Long lastModifiedDate;
}
