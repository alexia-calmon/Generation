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
