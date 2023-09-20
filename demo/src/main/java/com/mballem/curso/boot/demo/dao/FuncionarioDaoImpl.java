package com.mballem.curso.boot.demo.dao;

import com.mballem.curso.boot.demo.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{
}
