package com.mycompany.arvoreheranca;


    public class Bolsista extends Aluno{
    
    private double bolsa;
    
    public void renovaBolsa(){
        System.out.println("\nRenovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + "É bolsista! Pagamento facilitado");
    }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

