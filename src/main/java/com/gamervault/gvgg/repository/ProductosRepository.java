package com.gamervault.gvgg.repository;

import com.gamervault.gvgg.models.ProductosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<ProductosModel, Long> {

}
