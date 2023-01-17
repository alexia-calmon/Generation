/* // CLIENTE
package Cadastros.model;

import java.util.Scanner;

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
//TESTA CLIENTE
package Cadastros.model;

    public class TestaCliente {
        public static void main(String[] args) {


            Cliente c1 = new Cliente("Josephina","ES",55,31.7190 ,1f);

            c1.visualizar();



        }

    }

    //FUNCIONARIO
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
//TESTA FUNCIONÁRIO
package Cadastros.model;

import java.util.Scanner;

    public class TestaFuncionario {

        public static Scanner Read = new Scanner(System.in);
        public static void main(String[] args) {

            int menu;




            Cadastros.model.Funcionario f1 = new Cadastros.model.Funcionario("Marina", "Adm", 2000.0, 40, 01);
            Cadastros.model.Funcionario f2 = new Cadastros.model.Funcionario("Pedro", "Adm", 2000.0, 34, 02);
            Cadastros.model.Funcionario f3 = new Cadastros.model.Funcionario("Ana", "Adm", 2000.0, 40, 03);
            Cadastros.model.Funcionario f4 = new Cadastros.model.Funcionario("Marcelo", "Adm", 2000.0, 34, 04);

            while (true) {

                System.out.println("____________________________________________________________________");
                System.out.println("                                                                    ");
                System.out.println("                       FUNCIONARIOS                                 ");
                System.out.println("                                                                    ");
                System.out.println("____________________________________________________________________");
                System.out.println("                                                                    ");
                System.out.println("   1 - Cadastrar Funcionario                                        ");
                System.out.println("   2 - Buscar Funcionario                                           ");
                System.out.println("   3 - Dados do Funcionario                                         ");
                System.out.println("   4 - Alterar Salario                                              ");
                System.out.println("   5 - Alterar nome                                                 ");
                System.out.println("   6 - Alterar Cargo                                                ");
                System.out.println("   7 - Sair                                                         ");
                System.out.println("                                                                    ");
                System.out.println("                                                                    ");
                System.out.println("____________________________________________________________________");
                menu = Read.nextInt();

                if(menu == 7){

                    System.out.println("\n Fechando a tela de Funcionarios.");
                    Read.close();
                    System.exit(0);
                }

                switch(menu){

                    case 1:
                        System.out.println("Cadastrar Funcionario");
                        break;
                    case 2:
                        System.out.println("Buscar Funcionario");
                        break;
                    case 3:
                        System.out.println("Dados do Funcionario");
                        break;
                    case 4:
                        System.out.println("Alterar Salario");
                        break;
                    case 5:
                        System.out.println("Alterar Nome");
                        break;
                    case 6:
                        System.out.println("Alterar Cargo");
                        break;

                    default:
                        System.out.println("\n Opcao invalida");

                }

            }
        }

    }

    //PRODUTO
package Cadastros.model;

    public class Produto {

        private String produto;
        private double valor;
        private int quantidade;


        public Produto(String produto, double valor, int quantidade) {
            this.produto = produto;
            this.valor = valor;
            this.quantidade = quantidade;
        }

        public String getProduto() {
            return produto;
        }

        public void setProduto(String produto) {
            this.produto = produto;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public void visualizar(){

            System.out.println("\n__________________________________");
            System.out.println("            PRODUTOS                ");
            System.out.println("\n Produto: "+getProduto());
            System.out.println("\n Preço: $"+getValor());
            System.out.println("\n Quantidade: "+getQuantidade());
            System.out.println("\n                                  ");
            System.out.println("\n                                  ");
            System.out.println("\n                                  ");
            System.out.println("\n__________________________________");
        }

//TESTA GAME
package Cadastros.model;

        public class TestaGame {
            public static void main(String[] args) {

                Cadastros.model.Produto p1 = new Cadastros.model.Produto("PS4", 3349.0,1);
                Cadastros.model.Produto p2 = new Cadastros.model.Produto("Funko Pop Spider Man", 150.0,1);
                Cadastros.model.Produto p3 = new Cadastros.model.Produto("Console Nintendo Switch", 2249.0,1);
                Cadastros.model.Produto p4 = new Cadastros.model.Produto("Headset Gamer", 200.0,1);
                Cadastros.model.Produto p5= new Cadastros.model.Produto("Card Pokémon Box", 150.0,1);
                Cadastros.model.Produto p6 = new Cadastros.model.Produto("Mouse Redragon Vampire", 160.0,1);
                Cadastros.model.Produto p7 = new Cadastros.model.Produto("Controle Xbox One", 400.0,1);
                Cadastros.model.Produto p8 = new Cadastros.model.Produto("Console Box Retrô", 600.0,1);
                Cadastros.model.Produto p9 = new Cadastros.model.Produto("Carregador de Pilhas USB", 80.0,1);
                Cadastros.model.Produto p10 = new Cadastros.model.Produto("Pilha Panasonic", 8.0,1);


                p1.visualizar();
                p2.visualizar();
                p3.visualizar();
                p4.visualizar();
                p5.visualizar();
                p6.visualizar();
                p7.visualizar();
                p8.visualizar();
                p9.visualizar();
                p10.visualizar();


            }
        }

*/

