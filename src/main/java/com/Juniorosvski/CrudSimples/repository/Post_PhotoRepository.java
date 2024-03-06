package com.Juniorosvski.CrudSimples.repository;

import com.Juniorosvski.CrudSimples.entity.Post_Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Post_PhotoRepository extends JpaRepository<Post_Photo,Long> {
}
