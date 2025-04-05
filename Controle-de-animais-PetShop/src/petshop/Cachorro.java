package petshop;

public class Cachorro extends Animal implements ServicoPetShop {
    public Cachorro(String nome, int idade, String raca){
        super(nome, idade, raca);
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " diz: Au Au!");
    }

    @Override
    public void darBanho(){
        System.out.println("Dando banho no cachorro " + nome + " com shampoo especial.");
    }
    @Override
    public void fazerTosa(){
        System.out.println("Fazendo tosa no cachorro " + nome + " com máquina e tesoura.");
    }
}
