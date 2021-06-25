package n2;

public class Conta {
   
    //Atributos
    public int numero;
    public String titular;
    public float saldo;

    //Construtor
    public Conta(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Métodos
    public void sacar(float valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Você não possui saldo suficiente!");
        }
    }

    public void depositar(float valor) {
        this.saldo = this.saldo + valor;
    }

    public void extrato() {
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo + "\n");
    }
}
