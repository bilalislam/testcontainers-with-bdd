package org.testcontainers.demo.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TroubleTicketAssignedUserUpdateRequest {

    @NotBlank
    @Length(max = 255)
    private String assignedUser;

    @Length(max = 255)
    private String author;
}
