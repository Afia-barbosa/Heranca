package org.example;

import java.util.Date;

   public class Funcionario {

        private String nome;
        private String CPF;
        private Date dataNascimento;
        private float salario;

       public String getNome() {
           return nome;
       }

       public void setNome(String nome) {
           this.nome = nome;
       }

       public String getCPF() {
           return CPF;
       }

       public void setCPF(String CPF) {
           this.CPF = CPF;
       }

       public Date getDataNascimento() {
           return dataNascimento;
       }

       public void setDataNascimento(Date dataNascimento) {
           this.dataNascimento = dataNascimento;
       }

       public float getSalario() {
           return salario;
       }

       public void setSalario(float salario) {
           this.salario = salario;
       }
   }
