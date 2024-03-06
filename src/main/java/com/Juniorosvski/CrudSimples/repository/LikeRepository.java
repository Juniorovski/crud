package com.Juniorosvski.CrudSimples.repository;

import com.Juniorosvski.CrudSimples.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like,Long> {
}
