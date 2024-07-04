package com.funcionarios.projetofuncionarios.service;

import com.funcionarios.projetofuncionarios.entity.Funcionario;
import com.funcionarios.projetofuncionarios.repository.Repository;
import com.funcionarios.projetofuncionarios.service.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioServiceImp implements FuncionariosService {
    @Autowired
    private Repository funcionarioRepository;
    @Override
    public List<Funcionario> listAll() {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarioRepository.findAll().forEach(funcionarios::add);
        return funcionarios;
    }

}
