package dev.commerse.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private int customerID;
    private String username;
    private String password;
    private String pgp_public;
    private String role;
    private LocalDateTime last_login;
    private LocalDateTime created_at;
}
