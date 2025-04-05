import models.Carro;
import models.Fabricante;
import models.ModelosAno;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.Id = 1111L;
        carro1.modelo = "Corola";
        carro1.ano = 2022;
        carro1.cor = "vermelho";

        carro1.ExibirInformacao();


        System.out.println("\n---------------------");


        carro1.MoverVeiculo();

        System.out.println("\n---------------------\n");

        Fabricante fab = new Fabricante();
        fab.VeiculoDoAno();
        ModelosAno model = new ModelosAno();
        model.VeiculoDoAno();
    }
}