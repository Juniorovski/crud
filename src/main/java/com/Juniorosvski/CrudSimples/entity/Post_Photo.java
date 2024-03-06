package com.Juniorosvski.CrudSimples.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post_photos", schema = "CRUDSOCIAL")
public class Post_Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "posts_photos_sq")
    @SequenceGenerator(schema = "CRUDSOCIAL",name = "posts_photos_sq", sequenceName = "posts_photos_sq",initialValue = 1,allocationSize = 1)
    private Long id;
    @Column(name ="photo_name" )
    private String photoName;
    private String url;
    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Post post;
}
