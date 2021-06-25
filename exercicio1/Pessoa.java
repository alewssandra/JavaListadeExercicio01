package exercicio1;

public class Pessoa {
    //Atributos
    public String nome;
    public int peso, idade;

    //Construtor
    public Pessoa(String nome, int peso, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }
    
    //Métodos
    public void caminha(){
        this.peso--;
    }
    
    public void come(){
        this.peso++;
    }
    
    public void fazAniversario(){
        this.idade++;
    }
    
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso + "\n");
    }    
}
