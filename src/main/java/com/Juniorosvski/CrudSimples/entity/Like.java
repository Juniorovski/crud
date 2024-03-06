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
@Table(name = "likes", schema = "CRUDSOCIAL")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "likes_sq")
    @SequenceGenerator(schema = "CRUDSOCIAl",name = "likes_sq",sequenceName = "likes_sq",initialValue = 1,allocationSize = 1)

    private Long id;
    @CreationTimestamp
    @Column(name = "create_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "update_at")
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
