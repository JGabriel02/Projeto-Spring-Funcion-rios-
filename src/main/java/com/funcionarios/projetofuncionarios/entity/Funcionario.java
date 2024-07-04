package com.funcionarios.projetofuncionarios.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection="Funcionarioss")
public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private String departamento;
    private String cidade;
    private String estado;
    private String formatoTrabalho;
    private double salario;


    public Funcionario(String nome, int idade, String cargo, String departamento, String cidade, String estado, String formatoTrabalho, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.departamento = departamento;
        this.cidade = cidade;
        this.estado = estado;
        this.formatoTrabalho = formatoTrabalho;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFormatoTrabalho() {
        return formatoTrabalho;
    }

    public void setFormatoTrabalho(String formatoTrabalho) {
        this.formatoTrabalho = formatoTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario that)) return false;
        return getIdade() == that.getIdade() && Double.compare(that.getSalario(), getSalario()) == 0 && Objects.equals(getNome(), that.getNome()) && Objects.equals(getCargo(), that.getCargo()) && Objects.equals(getDepartamento(), that.getDepartamento()) && Objects.equals(getCidade(), that.getCidade()) && Objects.equals(getEstado(), that.getEstado()) && Objects.equals(getFormatoTrabalho(), that.getFormatoTrabalho());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade(), getCargo(), getDepartamento(), getCidade(), getEstado(), getFormatoTrabalho(), getSalario());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cargo='" + cargo + '\'' +
                ", departamento='" + departamento + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", formatoTrabalho='" + formatoTrabalho + '\'' +
                ", salario=" + salario +
                '}';
    }
}
