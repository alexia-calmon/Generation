programa {
  funcao inicio() {

    inteiro idade
    
    escreva ("Digite sua idade e descubra se voc� deve votar: \n")
    leia (idade)

    se (idade >= 16 e idade < 18)
    escreva ("Voc� est� apte a votar, mas o voto n�o � obrigat�rio.")

    se (idade >= 18 e idade < 65)
    escreva ("Voc� est� apte a votar e o voto � obrigat�rio.")

    se (idade <16)
    escreva ("Voc� n�o est� apte a votar.")

    senao se  (idade >=65)
    escreva ("Voc� est� apte a votar, mas seu voto n�o � obrigat�rio.")

  }
}
