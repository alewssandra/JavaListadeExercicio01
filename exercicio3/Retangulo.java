package exercicio3;

public class Retangulo {

    //Atributos
    public float altura, largura;

    //Construtor
    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    //Métodos
    public float calcularArea(){
        float area = altura * largura;
        return area;
    }
    
    public float calcularPerimetro(){
        float perimetro = (2*altura + 2*largura);
        return perimetro;
    }
    
    public void imprimir(){
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro() + "\n");
    }
}
