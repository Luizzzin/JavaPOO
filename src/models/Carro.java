package models;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;

    public void ExibirInformacao() {
        System.out.println("==========modelocarro=========");
        System.out.println("Modelo do carro é: " + modelo);
        System.out.println("\no ano do carro é : " + ano);
        System.out.println("\na cor do carro é : " + cor);
        System.out.println("==============================");

    }
}
