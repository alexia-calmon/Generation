//EXERCÍCIO1
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int num1, num2, contador;

        System.out.println("Digite o primeiro número: ");
        Scanner leia = new Scanner(System.in);
        num1 = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();

        if (num1 < num2) {
            for (contador = num1; contador <= num2; contador++) {

                if (contador % 3 == 0 && contador % 5 == 0) {
                    System.out.println(contador + " é múltiplo de 3 e 5.");
                }
            }

        } else {
            System.out.println("Intervalo inválido.");
        }
    }
}

//EXERCÍCIO2
import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {

        int numero, numImpares = 0, numPares = 0;
        int contador;
        Scanner leia = new Scanner(System.in);


        for (contador = 1; contador <= 10; contador++) {
            System.out.println("\nDigite o " + contador + "º número: ");
            numero = leia.nextInt();

            if (numero % 2 == 0) {
                numPares++;
            } else {
                numImpares++;
            }

        }
        System.out.println("Total de números pares: " + numPares);
        System.out.println("Total de números ímpares: " + numImpares);
    }
}

//EXERCÍCIO3
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 0, idadeMenor = 0, idadeMaior = 0;

        while (idade >= 0) {
            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();

            if (idade < 21)
                idadeMenor++;

            else idadeMaior++;
        }
        System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor + "\nTotal de pessoas maiores de 50 anos: " + idadeMaior);
    }
}

//EXERCÍCIO5

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 0, soma = 0;

        do {
            System.out.println("Digite um número diferente de zero: ");
            num = leia.nextInt();

            if (num > 0)
                soma += num;
            else {
                System.out.println("O número é inválido.");
            }

        } while (num != 0);
        System.out.println("A soma dos números positivos é: " + soma);


    }
}

//EXERCÍCIO6

public class exercício6 {
    public static void main(String[] args) {
        int contador = -1;
        double num=0, media=0;

        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("Digite um número inteiro, diferente de zero: ");
            num = leia.nextInt();

            if (num % 3 == 0) {
                contador ++;
                media += num;
            }

        } while (num != 0);
        System.out.println("A média dos números digitados é igual a: " + media/contador);
    }
}
