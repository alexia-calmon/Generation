package Cadastros.model;

public class Cliente {

    private String nome;
    private String UF;
    private int idade;

    private double matricula;

    private float unidade;


    public Cliente(String nome, String UF, int idade, double matricula, float unidade) {
        this.nome = nome;
        this.UF = UF;
        this.idade = idade;
        this.matricula = matricula;
        this.unidade = unidade;
    }


    public float getUnidade() {
        return unidade;
    }

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

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
    public void visualizar() {
        System.out.println("\n*********************************");
        System.out.println("____________CLIENTE________________");
        System.out.println("\nNome: "+ getNome());
        System.out.println("\ndade: "+getIdade());
        System.out.println("\nUF: "+getUF());
        System.out.println("\nMatricula: "+getMatricula());
        System.out.println("\nUNIDADE: "+getUnidade());
        System.out.println("\n**********************************");

    }



}