package com.mballem.curso.boot.demo.dao;

import com.mballem.curso.boot.demo.domain.Departamento;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao{

}
