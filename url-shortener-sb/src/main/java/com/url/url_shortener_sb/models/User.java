package com.url.url_shortener_sb.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Email;
    private String username;
    private String password;
    private String role = "ROLE_USER";
}
