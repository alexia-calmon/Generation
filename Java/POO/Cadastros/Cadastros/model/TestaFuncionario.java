package Cadastros.model;

import java.util.Scanner;

public class TestaFuncionario {

    public static Scanner Read = new Scanner(System.in);
    public static void main(String[] args) {

        int menu;




        Funcionario f1 = new Funcionario("Marina", "Adm", 2000.0, 40, 01);
        Funcionario f2 = new Funcionario("Pedro", "Adm", 2000.0, 34, 02);
        Funcionario f3 = new Funcionario("Ana", "Adm", 2000.0, 40, 03);
        Funcionario f4 = new Funcionario("Marcelo", "Adm", 2000.0, 34, 04);

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