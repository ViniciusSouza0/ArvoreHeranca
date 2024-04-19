package com.mycompany.arvoreheranca;

public class Pessoa {

protected String nome;
private int idade;
private String sexo;
        
    public void fazerAniver (){
        this.idade ++;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String detalhesPessoa() {
        return "\nDados da Pessoa: " + "\nnome:" + nome + "\nidade: " + idade + "\nsexo: " + sexo;
    }
      
      
      
      
}
