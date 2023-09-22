package com.mballem.curso.boot.demo.service;

import com.mballem.curso.boot.demo.dao.DepartamentoDao;
import com.mballem.curso.boot.demo.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{

    @Autowired
    private DepartamentoDao dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Departamento departamento) {
        dao.save(departamento);
    }
    @Transactional(readOnly = false)
    @Override
    public void editar(Departamento departamento) {
        dao.update(departamento);
    }
    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Departamento buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Departamento> buscarTodos() {
        return dao.findAll();
    }

    @Override
    public boolean departamentoTemCargos(Long id) {
        if (buscarPorId(id).getCargos().isEmpty()) {
            return false;
        }
        return true;
    }
}
