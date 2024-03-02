package org.testcontainers.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LegacyData {

    @Field("problem_source")
    private Integer problemSource;

    @Field("report_problem")
    private Integer reportProblem;

    @Field("os")
    private Integer os;

    @Field("wb")
    private Integer wb;

    @Field("event_type")
    private String eventType;

    @Field("read_only")
    private String readOnly;

    @Field("finalized")
    private Integer finalized;

    @Field("process_sequence")
    private String processSequence;

    @Field("transaction_group")
    private Integer transactionGroup;

    @Field("source")
    private String source;
}
