package dev.regeorged;

import lombok.*;

@EqualsAndHashCode
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String email;
}
