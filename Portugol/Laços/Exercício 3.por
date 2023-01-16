programa {
  funcao inicio() {

    inteiro idade
    
    escreva ("Digite sua idade e descubra se você deve votar: \n")
    leia (idade)

    se (idade >= 16 e idade < 18)
    escreva ("Você está apte a votar, mas o voto não é obrigatório.")

    se (idade >= 18 e idade < 65)
    escreva ("Você está apte a votar e o voto é obrigatório.")

    se (idade <16)
    escreva ("Você não está apte a votar.")

    senao se  (idade >=65)
    escreva ("Você está apte a votar, mas seu voto não é obrigatório.")

  }
}
