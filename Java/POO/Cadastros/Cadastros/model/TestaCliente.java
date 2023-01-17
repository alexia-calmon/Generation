package Cadastros.model;

public class TestaCliente {
    public static void main(String[] args) {

        //c1 é um objeto
        // new é palavra reservada do método construtor
        Cliente c1 = new Cliente("Josephina","ES",55);
        Cliente c2 = new PessoaFisica("Murilo", "SP", 30, 177123, "Solteiro", "Superior Completo");
        Cliente c3 = new PessoaJuridica("Ana Maria", "DF", 45, 674747, "Ana Modas", "Ana Gallo");

        //Acessando os Métodos da Classe Cliente, usando o padrão objeto.método()
        c1.visualizar();
        c2.visualizar();
        c3.visualizar();



    }

}