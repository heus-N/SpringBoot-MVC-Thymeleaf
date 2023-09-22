package com.mballem.curso.boot.demo.service;

import com.mballem.curso.boot.demo.domain.Cargo;

import java.util.List;

public interface CargoService {

    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void excluir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();

    boolean cargoTemFuncionario(Long id);
}
