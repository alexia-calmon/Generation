//EXERC�CIO1
programa {
  funcao inicio() {
   inteiro num = 0

   enquanto(num <=10) {
   
      escreva("\nDigite um n�mero entre 1 e 10: ")
      leia(num)

    se((num > 0) e (num <=10)) {
  
      escreva("\n" , num , "*" + "1 = " ,num * 1)
      escreva("\n" , num , "*" + "2 = " ,num * 2)
      escreva("\n" , num , "*" + "3 = " ,num * 3)
      escreva("\n" , num , "*" + "4 = " ,num * 4)
      escreva("\n" , num , "*" + "5 = " ,num * 5)
      escreva("\n" , num , "*" + "6 = " ,num * 6)
      escreva("\n" , num , "*" + "7 = " ,num * 7)
      escreva("\n" , num , "*" + "8 = " ,num * 8)
      escreva("\n" , num , "*" + "9 = " ,num * 9)
      escreva("\n" , num , "*" + "10 = " ,num * 10)

}
   }
  }
}

//EXERC�CIO3
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

//EXERC�CIO5

programa {
  funcao inicio() {
    
    inteiro num, soma=0

    faca {
      escreva("Digite um n�mero: ")
      leia(num)

      se(num>=0) {
        soma+=num
        //soma=soma+num
      }
    } enquanto(num!=0)
    escreva("A soma dos n�meros positivos �: ",soma)
  } 
}