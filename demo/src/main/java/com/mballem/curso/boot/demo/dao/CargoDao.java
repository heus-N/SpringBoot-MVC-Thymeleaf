package com.mballem.curso.boot.demo.dao;

import com.mballem.curso.boot.demo.domain.Cargo;

import java.util.List;

public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo Cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();

}
