programa {
  funcao inicio() {
    
    inteiro numero

    escreva ("Digite um número: ")
    leia (numero)

    se (numero % 2 == 0) { 
      escreva ("\n O número " + numero + " é par")
      se (numero > 0) {
        escreva ("\n O número " + numero + " é positivo")
      }
      senao {
        escreva ("\nO número " + numero + " é negativo")
      }
    } 
      senao {
        escreva ("\nO número " + numero + " é ímpar")
        se (numero > 0) {
        escreva ("\nO número " + numero + " é positivo")
      }
      senao {
        escreva ("\nO número " + numero + " é negativo")
      }
      }
    

    


  }
}
