programa {
  funcao inicio() {
    
    inteiro numero

    escreva ("Digite um n�mero: ")
    leia (numero)

    se (numero % 2 == 0) { 
      escreva ("\n O n�mero " + numero + " � par")
      se (numero > 0) {
        escreva ("\n O n�mero " + numero + " � positivo")
      }
      senao {
        escreva ("\nO n�mero " + numero + " � negativo")
      }
    } 
      senao {
        escreva ("\nO n�mero " + numero + " � �mpar")
        se (numero > 0) {
        escreva ("\nO n�mero " + numero + " � positivo")
      }
      senao {
        escreva ("\nO n�mero " + numero + " � negativo")
      }
      }
    

    


  }
}
