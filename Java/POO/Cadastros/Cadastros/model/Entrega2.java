//CLASSE CLIENTE - EXERCÍCIO 1

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
        System.out.println("\nNome: " + getNome());
        System.out.println("\ndade: " + getIdade());
        System.out.println("\nUF: " + getUF());
        System.out.println("\n**********************************");

    }

}
//CLASSE PESSOA FÍSICA - EXERCÍCIO 1

package Cadastros.model;

public class PessoaFisica extends Cliente {

    private double CPF;
    private String estadoCivil;
    private String escolaridade;

    private int idade;

    public PessoaFisica(String nome, String UF, int idade, double CPF, String estadoCivil, String escolaridade) {
        super(nome, UF, idade);
        this.CPF = CPF;
        this.estadoCivil = estadoCivil;
        this.escolaridade = escolaridade;
        this.idade = idade;
    }

    public double getCPF() {
        return CPF;
    }

    public void setCPF(double CPF) {
        this.CPF = CPF;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void visualizar() {
        System.out.println("\n_________________________________________");
        System.out.println("\n                                         ");
        System.out.println("            CADASTRO                       ");
        System.out.println("\n    NOME: " + getNome());
        System.out.println("\n    IDADE: " + getIdade());
        System.out.println("\n    UF: " + getUF());
        System.out.println("\n    Estado Civil: " + getEstadoCivil());
        System.out.println("\n    CPF: " + getCPF());
        System.out.println("\n    Escolaridade: " + getEscolaridade());
        System.out.println("\n                                         ");
        System.out.println("\n                                         ");
        System.out.println("\n_________________________________________");

    }
}

//CLASSE PESSOA JURÍDICA - EXERCÍCIO 1

package Cadastros.model;

//Criando a Classe PessoaJuridica como herança da Classe Cliente//
public class PessoaJuridica extends Cliente {

    //definindo os atributos da pessoa jurídica
    private double cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    //Criando o Método Construtor com parâmetros na Classe PessoaJuridica
    public PessoaJuridica(String nome, String UF, int idade, double cnpj, String razaoSocial, String nomeFantasia) {
        super(nome, UF, idade);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;

    }
    //Método Get e Set para os atributos da Classe PessoaJuridica//

    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    //Método visualizar() para exibir todos os dados do Objeto//
    public void visualizar() {
        System.out.println("\n_________________________________________");
        System.out.println("\n                                         ");
        System.out.println("            CADASTRO                       ");
        System.out.println("\n    NOME: " + getNome());
        System.out.println("\n    UF: " + getUF());
        System.out.println("\n    CIDADE:  " + getIdade());
        System.out.println("\n    Nome Fantasia: " + getNomeFantasia());
        System.out.println("\n    CNPJ: " + getCnpj());
        System.out.println("\n    Razao Social: " + getRazaoSocial());
        System.out.println("\n    Nome Fantasia: " +getNomeFantasia());
        System.out.println("\n                                         ");
        System.out.println("\n                                         ");
        System.out.println("\n_________________________________________");

    }
}

//CLASSE TESTA CLIENTE - EXERCÍCIO 1

package Cadastros.model;

public class TestaCliente {
    public static void main(String[] args) {

        //c1 é um objeto
        // new é palavra reservada do método construtor
        Cliente c1 = new Cliente("Josephina","ES",55);
        Cliente c2 = new PessoaFisica("Murilo", "SP", 30, 177123, "Solteiro", "Superior Completo");
        Cliente c3 = new PessoaJuridica("Ana Maria", "DF", 45, 674747, "Ana Modas", "Ana Gallo");

        //Acessando os Métodos da Classe Cliente, usando o padrão objeto.método()
        c1.visualizar();
        c2.visualizar();
        c3.visualizar();



    }

}

