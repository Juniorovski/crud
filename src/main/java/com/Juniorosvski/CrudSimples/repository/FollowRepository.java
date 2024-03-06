package com.Juniorosvski.CrudSimples.repository;

import com.Juniorosvski.CrudSimples.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowRepository extends JpaRepository<Follow,Long> {
}
