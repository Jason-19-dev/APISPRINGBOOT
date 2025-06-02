package com.gamervault.gvgg.repository;
import com.gamervault.gvgg.models.UsersModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersModel, Long> {

    
}
    