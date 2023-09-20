package com.mballem.curso.boot.demo.dao;

import com.mballem.curso.boot.demo.domain.Funcionario;

import java.util.List;

public interface FuncionarioDao {
    void save(Funcionario Funcionario);

    void update(Funcionario Funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
