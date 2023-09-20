package com.mballem.curso.boot.demo.dao;

import com.mballem.curso.boot.demo.domain.Cargo;
import org.springframework.stereotype.Repository;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{
}
