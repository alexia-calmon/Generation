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