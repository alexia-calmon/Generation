//EXERC?CIO 1

programa
{
	
	funcao inicio()
	{

		// Vetor n?o Ordenado 
		inteiro vetorInteiros[10] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, j, i, copia, tamanho

		// Informa o tamanho do vetor
		tamanho = 10

		// Algoritmo de Ordena??o
		para(i = 0; i < (tamanho - 1); i++){
      		para(j = 0; j < (tamanho - 1 - i; j++){
		        se(vetorInteiros[j] < vetorInteiros[j+1]){
		          copia = vetorInteiros[j]
		          vetorInteiros[j] = vetorInteiros[j+1]
		          vetorInteiros[j+1] = copia
		        }
      		}
    		}
    		
		escreva("\nVetor de Numeros Inteiros n?o Ordenados: \n")
		
    inteiro tam = 11

		para(inteiro indice=0; indice < tamanho; indice ++){
			escreva(tam -= 1, "? Numero: ", vetorInteiros[indice], "\n")
		}
		
	}
}


//EXERC?CIO 3

programa {
    funcao inicio() {
        inteiro matriz[3][3]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, diagP[3], diagS[3], n, p, somaP = 0, somaS = 0

        para(n = 0; n < 3; n++){
            para(p = 0; p < 3; p++){
                se(n==p){
                    diagP[n] = matriz[n][p]
                }
                se((n+p)==2){
                    diagS[n] = matriz[n][p]
                }
            }
        }

        escreva("Os elementos da diagonal principal: ")
        para(n = 0; n < 3; n++){
            escreva(diagP[n], " ")
            somaP = somaP + diagP[n]
        }

        escreva("\n Os elementos da diagonal secund?ria:  ")
        para(n = 0; n < 3; n++){
            escreva(diagS[n]," ")
            somaS = somaS + diagS[n]
        }

        escreva("\nSoma dos elementos da Diagonal Principal: ", somaP)

        escreva("\nSoma dos elementos da Diagonal Secund?ria: ", somaS)