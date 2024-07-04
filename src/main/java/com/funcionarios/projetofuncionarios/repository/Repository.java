package com.funcionarios.projetofuncionarios.repository;

import com.funcionarios.projetofuncionarios.entity.Funcionario;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<Funcionario, ObjectId> {
}
