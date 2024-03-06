package com.Juniorosvski.CrudSimples.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "follows", schema = "CRUDSOCIAL")
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "follows_sq")
    @SequenceGenerator(schema = "CRUDSOCIAL", name = "follows_sq",sequenceName = "follows_sq",initialValue = 1,allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name="followers_id")
    private User followers;

    @ManyToOne
    @JoinColumn(name="users_id")
    private User user;
}
