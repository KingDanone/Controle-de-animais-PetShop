package petshop;

public class PetShopTest {
    public static void main(String[] args){
        Cachorro dog = new Cachorro(" Rex", 3, " Labrador");
        Gato cat = new Gato(" Miau", 2," Perça");

        //exibindo as paradas do vacilão do cachorro
        System.out.println(dog.getDescricao());
        dog.emitirSom();
        dog.darBanho();
        dog.fazerTosa();

        //exibindo as paradas do vacilão do gato
        System.out.println(cat.getDescricao());
        cat.emitirSom();
        cat.darBanho();
        cat.fazerTosa();
    }
}
