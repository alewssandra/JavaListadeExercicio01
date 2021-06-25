package exercicio4;

public class Empregado {

    //Atributos
    private String nome, sobrenome;
    private float salario;

    //Construtor
    public Empregado(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    //Métodos
    public void salarioAnual() {
        float salarioAnual = this.salario * 12;
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Salário Anual: " + salarioAnual + "\n");
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
