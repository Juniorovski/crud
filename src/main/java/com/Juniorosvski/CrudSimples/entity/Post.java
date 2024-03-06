package com.Juniorosvski.CrudSimples.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts", schema = "CRUDSOCIAL")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "posts_sq")
    @SequenceGenerator(schema = "CRUDSOCIAL", name = "posts_sq", sequenceName = "posts_sq",initialValue = 1,allocationSize = 1)
    private Long id;
    @Column(name = "text_content")
    private String text_content;

    @CreationTimestamp
    @Column(name = "create_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "update_at")
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
