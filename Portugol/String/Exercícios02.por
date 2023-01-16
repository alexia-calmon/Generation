//EXERCICIO1
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

//EXERCÍCIO2
programa {
  funcao inicio() {
    inteiro codigo
    inteiro qtd
    cadeia nome
    real pc
    real total

    escreva("# ## ### #### #########   Menu   ########## #### ### ## #\n")
		
		escreva("--Digite 1 para Cachorro-Quente\n")
		escreva("--Digite 2 para X-Salada--\n")
		escreva("--Digite 3 para X-Bacon--\n")
    escreva("--Digite 4 para Bauru--\n")
    escreva("--Digite 5 para Refrigerante--\n")
    escreva("--Digite 6 para Suco de laranja--\n")

    escreva("Digite o código do produto escolhido ")
    leia(codigo)

    escolha(codigo)
		{
			caso 1:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "Cachorro-Quente"
        pc = 10.00
        total = qtd * pc
        
				pare

			caso 2:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "X-Salada"
        pc = 15.00
        total = qtd * pc
        
				pare
			caso 3:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "X-Bacon"
        pc = 18.00
        total = qtd * pc
        
				pare

        caso 4:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "Bauru"
        pc = 12.00
        total = qtd * pc
        
				pare

        caso 5:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "Refrigerante"
        pc = 8.00
        total = qtd * pc
        
				pare

        caso 6:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "Suco de laranja"
        pc = 13.00
        total = qtd * pc
        
				pare

        caso contrario:
				escreva("Código inválido!")
			
		}
        se((codigo <= 6) e (codigo > 1))
        {
        escreva("\nO valor total do produto " + nome + " é de " + total + " reais")
        }
  }

}

//EXERCÍCIO03
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

//EXERCÍCIO4
programa {
  inclua biblioteca Matematica

  funcao inicio() {
    real salario
    
    escreva ("Digite seu salário: ")
    leia(salario)
    salario = Matematica.arredondar(salario,2)

    se(salario <=2000.00)
    escreva("Você está isento e não precisa pagar o Imposto de Renda. ")

    senao se(salario >= 2000.01 e salario <= 3000.00)
    escreva("O imposto a ser pago é de: \nR$", (salario * (8/100)))

    senao se(salario >=3000.01 e salario <= 4500.00)
    escreva ("O imposto a ser pago é de: \nR$", (salario * (18/100)))

    senao 
    salario = Matematica.arredondar(salario * (28/100),2)
    escreva("O imposto a ser pago é de: \nR$", salario)
  }
}

//EXERCÍCIO5
programa {
  funcao inicio() {
  cadeia tipoAnimal, classeAnimal, tipoAlimentacao

  escreva("O animal é vertebrado ou invertebrado? ")
  leia(tipoAnimal)

  se ((tipoAnimal == "vertebrado") ou (tipoAnimal == "VERTEBRADO")) {
    escreva("O animal é uma ave ou um mamífero? ")
    leia(classeAnimal)

    se ((classeAnimal == "ave") ou (tipoAnimal == "AVE")) {
      escreva ("O animal é carnívoro ou onívoro? ")
      leia(tipoAlimentacao)

      se ((tipoAlimentacao == "carnívoro") ou (tipoAlimentacao == "CARNÍVORO")){
        escreva ("Águia")
      }
      senao se ((tipoAlimentacao == "onívoro") ou (tipoAlimentacao == "ONÍVORO")) {
        escreva("Pomba")
      }
    }
    senao se ((classeAnimal == "mamífero") ou (classeAnimal == "MAMÍFERO")) {
    escreva("O animal é onívoro ou herbívoro? ")
    leia(tipoAlimentacao)

    se ((tipoAlimentacao == "onívoro") ou (tipoAlimentacao == "ONÍVORO")){
        escreva ("Homem")
      }
      senao se ((tipoAlimentacao == "herbívoro") ou (tipoAlimentacao == "HERBÍVORO")) {
        escreva("Vaca") }
      }

    }
    senao se ((tipoAnimal == "invertebrado") ou (tipoAnimal == "INVERTEBRADO")) {
      escreva("O animal é um inseto ou um anelídeo? ")
      leia (classeAnimal)

      se ((classeAnimal == "inseto") ou (tipoAnimal == "INSETO")) {
      escreva ("O animal é hematófago ou herbívoro? ")
      leia(tipoAlimentacao)

      se ((tipoAlimentacao == "hematófago") ou (tipoAlimentacao == "HEMATÓFAGO")){
        escreva ("Pulga")
      }
      senao se ((tipoAlimentacao == "herbívoro") ou (tipoAlimentacao == "HERBÍVORO")) {
        escreva("Lagarta")
      }
    }
    senao se ((classeAnimal == "anelídeo") ou (classeAnimal == "ANELÍDEO")) {
    escreva("O animal é hematófago ou onívoro? ")
    leia(tipoAlimentacao)

    se ((tipoAlimentacao == "hematófago") ou (tipoAlimentacao == "HEMATÓFAGO")){
        escreva ("Sanguessuga")
      }
      senao se ((tipoAlimentacao == "onívoro") ou (tipoAlimentacao == "ONÍVORO")) {
        escreva("Minhoca")
      }
    }
  }
  }
}

