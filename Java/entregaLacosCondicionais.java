//EXERCÍCIO 1//

import java.util.Locale;
import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numA, numB, numC, soma;

        System.out.println("Digite um número A: ");
        numA = ler.nextInt();

        System.out.println("Digite um número B: ");
        numB = ler.nextInt();

        System.out.println("Digite um número C: ");
        numC = ler.nextInt();

        soma = (numA + numB);

        if (soma > numC) {
            System.out.println("\nA soma de A + B é maior do que C. ");
        } else if (soma < numC) {
            System.out.println("\nA soma de A + B é menor do que C.");
        } else {
            System.out.println("\nA soma de A + B é igual a C.");

        }

    }
}

//EXERCÍCIO2//

   import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = ler.nextInt();

        if (numero % 2 == 0) {
            System.out.print("O número é par ");

            if (numero > 0) {
                System.out.println("e positivo. ");
            } else {
                System.out.print("O número é negativo.");
            }
        } else {
            System.out.print("O número é ímpar ");
            if (numero > 0) {
                System.out.print("e positivo ");
            } else {
                System.out.print("e negativo");
            }
        }
    }
}

/*EXERCÍCIO3*/

package Java;

        import java.util.Locale;
        import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int codigo, quantidade;
        float preco;

        Scanner leia = new Scanner(System.in);

        System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

        System.out.println("--Digite 1 para Cachorro-Quente");
        System.out.println("--Digite 2 para X-Salada--");
        System.out.println("--Digite 3 para X-Bacon--");
        System.out.println("--Digite 4 para Bauru--");
        System.out.println("--Digite 5 para Refrigerante--");
        System.out.println("--Digite 6 para Suco de laranja--");

        System.out.print("Digite o código do produto: ");
        codigo = leia.nextInt();
        System.out.print("Digite a quantidade desejada: ");
        quantidade = leia.nextInt();
        System.out.println();


        switch (codigo) {
            case 1:
                System.out.printf(quantidade + "x Cachorro-Quente - Total: R$ %.2f", 10.00 * quantidade);
                break;

            case 2:
                System.out.printf(quantidade + "x X-Salada - Total: R$ %.2f", 15.00 * quantidade);
                break;
            case 3:
                System.out.printf(quantidade + "x X-Bacon - Total: R$ %.2f ", 18.00 * quantidade);
                break;
            case 4:
                System.out.printf(quantidade + "x Bauru - Total: R$ %.2f ", 12.00 * quantidade);
                break;
            case 5:
                System.out.printf(quantidade + "x Refrigerante - Total: R$ %.2f ", 8.00 * quantidade);
                break;
            case 6:
                System.out.printf(quantidade + "x Suco de laranja - Total: R$ %.2f ", 15.00 * quantidade);
                break;

            default:
                System.out.println("Código inválido!");


        }
    }
}