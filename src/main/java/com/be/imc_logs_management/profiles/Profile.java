package com.be.imc_logs_management.profiles;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("profiles")
public class Profile {
    @Id
    private String id;
    private String email;
    private String phone;
}
