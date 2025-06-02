package com.gamervault.gvgg.repository;

import com.gamervault.gvgg.models.ProductosModel;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import java.util.List;

@Repository
public interface ProductosRepository extends JpaRepository<ProductosModel, Long> {

    Optional<ProductosModel> findById(Long id);

    @Override
    default List<ProductosModel> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
