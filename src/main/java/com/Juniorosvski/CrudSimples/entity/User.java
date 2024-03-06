package com.Juniorosvski.CrudSimples.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users", schema = "CRUDSOCIAL")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "users_sq")
    @SequenceGenerator(schema = "CRUDSOCIAL",name = "users_sq", sequenceName = "users_sq",initialValue =1, allocationSize = 1)
    private Long id;
    private String name;
    private String email;

    @Column(unique = true)
    private String username;
    private String password;
    private String bio;
    private boolean active;

    @CreationTimestamp
    @Column(name="created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name="updated_at")
    private LocalDateTime updatedAt;
}
