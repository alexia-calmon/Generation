package Cadastros.model;

public class Cliente {

    //Classe Cliente com os respectivos Atributos e Modificadores de Acesso
    private String nome;
    private String UF;
    private int idade;

    private double matricula;

    private float unidade;

    //Método construtor da Classe Cliente (public para que outras Classes tenham acesso ao Método e possam instanciar novos Objetos
    public Cliente(String nome, String UF, int idade) {
        this.nome = nome;
        this.UF = UF;
        this.idade = idade;

        /* THIS=sempre que os nomes das variáveis de um método forem iguais aos nomes dos atributos de uma classe,
        devemos usar a palavra this para identificar o atributo. */
    }

    /*SET servem para modificar os atributos. Entre (), indicamos o novo valor desejado para o atributo (parâmetro)
    É recomendado que o setter valide os novos valores para variáveis de instância,
    inclusive retornando um valor ou mensagem para indicar que os dados são inválidos. */
    public float getUnidade() {
        return unidade;
    }
        /*GET servem para ler os dados dos atributos.
        diferente do Método Set, ele não recebe parâmetro. Eles também são conhecidos como métodos de acesso
        ou métodos de consulta, porquê obtêm os valores dos atributos do Objeto.
        Último botão do mouse - Generate - Getter and Setter */

    public void setUnidade(float unidade) {
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }


    //Acessando os métodos da Main, instancia o visualizar e os parâmetros
    public void visualizar() {
        System.out.println("\n*********************************");
        System.out.println("____________CLIENTE________________");
        System.out.println("\nNome: "+ getNome());
        System.out.println("\ndade: "+getIdade());
        System.out.println("\nUF: "+getUF());
        System.out.println("\n**********************************");

    }



}