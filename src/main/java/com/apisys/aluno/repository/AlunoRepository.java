package com.apisys.aluno.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.apisys.aluno.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long>{
    List<Aluno> findAll();
}