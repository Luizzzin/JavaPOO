package models;

public class Fabricante extends ModelosAno{

    public Long Id;
    public String modelo;
    public int ano;
    public String cor;

    @Override
   public void VeiculoDoAno(){
        System.out.println("Carro de rua");
    }

}
