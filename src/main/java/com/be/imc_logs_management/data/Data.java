package com.be.imc_logs_management.data;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("imc")
public class Data {
    @Id
    private String id;
    private String weight;
    private String height;
    private int result;
    private String suggestion;
}
