programa {
  funcao inicio() {
   inteiro num
   inteiro contadorPar=0, contadorImpar=0

   para(inteiro contador = 1; contador <=10; contador ++) {
    escreva("Digite o ", contador, "� numero: ")
    leia(num) 

    se(num%2 == 0) {
      contadorPar++
    } 
    senao {
      contadorImpar++
    }
  }
  escreva("\nTotal de n�meros pares: ", contadorPar)
  escreva("\nTotal de n�meros �mpares: ", contadorImpar)

  }
}
