package petshop;

public class Gato extends Animal implements ServicoPetShop {
    public Gato(String nome, int idade, String raca){
        super(nome, idade, raca);
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " diz: Miau miau disgraçaaaa !");
    }

    @Override
    public void darBanho(){
        System.out.println("Dando banho no gato " + nome + " com muito cuidado.");
    }
    @Override
    public void fazerTosa(){
        System.out.println("Fazendo tosa no gato " + nome + " com tesoura especial.");
    }
}
