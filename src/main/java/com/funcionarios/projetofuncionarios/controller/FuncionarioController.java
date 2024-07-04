package com.funcionarios.projetofuncionarios.controller;

import com.funcionarios.projetofuncionarios.entity.Funcionario;
import com.funcionarios.projetofuncionarios.service.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class FuncionarioController {
    @Autowired
    private FuncionariosService funcionariosService;

    @GetMapping("/")
    public ResponseEntity<String> inicio(){

        String response = """
                <html>
                    <body>
                            <a href="/listarFuncionarios">.1 Listar Funcionarios</a>
                    </body>
                </html>
                """;

        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
    @GetMapping("/listarFuncionarios")
    public ResponseEntity<List<Funcionario>> listarFuncionarios(){
        List<Funcionario> funcionarios = funcionariosService.listAll();
        return new ResponseEntity<List<Funcionario>>(funcionarios, HttpStatus.OK);
    }
}
