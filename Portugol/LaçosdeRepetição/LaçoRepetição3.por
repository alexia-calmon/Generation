programa {
  funcao inicio() {
    
    inteiro num, soma=0

    faca {
      escreva("Digite um número: ")
      leia(num)

      se(num>=0) {
        soma+=num
        //soma=soma+num
      }
    } enquanto(num!=0)
    escreva("A soma dos números positivos é: ",soma)
  } 
}
