package com.Juniorosvski.CrudSimples.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tags", schema = "CRUDSOCIAL")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "tags_sq")
    @SequenceGenerator(schema = "CRUDSOCIAL", name = "tags_sq", sequenceName = "tags_sq", initialValue = 1,allocationSize = 1)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Post post;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
