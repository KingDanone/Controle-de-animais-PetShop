package petshop;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String raca;

    public Animal(String nome, int idade, String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void emitirSom(){}

    public String getDescricao(){
        return nome + ", " + idade + " anos, raça: " + raca;
    }
}
