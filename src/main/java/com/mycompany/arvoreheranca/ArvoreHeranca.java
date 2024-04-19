package com.mycompany.arvoreheranca;

//Classes abstratas: Não podem ser instanciada e criar objetos, ou seja, serve somente como progenitora (Classe Mãe).

//Metódo abstrato: usamos em interface, ele é declarado mas não implementado na progenitora, sendo colocado dentro de uma interface 
//ou de uma classe abstrata.


//Classe Final: não pode ser herdado por outra classe, sendo assim obrigatoriamente uma "folha", não podendo "ter filhos"

//Metodo final: Não pode ser sobrescrito pelas subclasses, sendo obrigatoriamente, herdado.  


public class ArvoreHeranca {
//Info Alunos
public static void main(String[] args) {
Pessoa p1 = new Pessoa ();
Aluno a1 = new Aluno();
a1.setNome("Vinicius ");
a1.setMatricula(1111);
a1.setCurso("Info ");
a1.setIdade(22);
a1.setSexo("M");
System.out.println(a1.detalhesPessoa());
System.out.println(a1.detalhesAluno());
a1.pagarMensalidade();

//Info Visitante 
Visitante v1 = new Visitante ();
v1.setNome("Leonardo ");
v1.setIdade(18);
v1.setSexo("M");
System.out.println(v1.detalhesPessoa());

//Info Bolsista

Bolsista b1 = new Bolsista ();
b1.setNome("Eduardo ");
b1.setIdade(20);
b1.setSexo("M");
b1.setMatricula(1414);
b1.setCurso("Editor de vídeo");
b1.renovaBolsa();
b1.pagarMensalidade();
System.out.println(b1.detalhesAluno());



  
}
}
