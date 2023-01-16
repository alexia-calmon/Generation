package Cadastros.model;

public class Funcionario {


    private String nome;
    private String cargo;
    private double salario;
    private int idade;
    private double matricula;


    public Funcionario(String nome, String cargo, double salario, int idade, double matricula) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }


    public void visualizar() {
        System.out.println("\n*********************************");
        System.out.println("____________FUNCIONARIO________________");
        System.out.println("\nNome: "+ getNome());
        System.out.println("\nCargo: "+getCargo());
        System.out.println("\nSalario: "+getSalario());
        System.out.println("\nIdade: "+getIdade());
        System.out.println("\nMatricula: "+getMatricula());
        System.out.println("\n**********************************");

    }


}
