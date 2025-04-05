package models;
//aqui começa a herança da abstração
 public class Carro extends Veiculo {

    public Long Id;
    public String modelo;
    public int ano;
    public String cor;

    public void ExibirInformacao() {
        System.out.println("==========modelocarro=========");
        System.out.println("ID do carro é: " + Id);
        System.out.println("\nModelo do carro é: " + modelo);
        System.out.println("\no ano do carro é : " + ano);
        System.out.println("\na cor do carro é : " + cor);
        System.out.println("==============================");

    }
//aqui sobreescrevemos
    @Override
   public void MoverVeiculo(){
        System.out.println("Carro em movimento");
        System.out.println("Carro em alta velocidade");
    }
}
