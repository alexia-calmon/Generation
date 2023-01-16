package Cadastros.model;

public class TestaGame {
    public static void main(String[] args) {

        Produto p1 = new Produto("PS4", 3349.0,1);
        Produto p2 = new Produto("Funko Pop Spider Man", 150.0,1);
        Produto p3 = new Produto("Console Nintendo Switch", 2249.0,1);
        Produto p4 = new Produto("Headset Gamer", 200.0,1);
        Produto p5= new Produto("Card Pokémon Box", 150.0,1);
        Produto p6 = new Produto("Mouse Redragon Vampire", 160.0,1);
        Produto p7 = new Produto("Controle Xbox One", 400.0,1);
        Produto p8 = new Produto("Console Box Retrô", 600.0,1);
        Produto p9 = new Produto("Carregador de Pilhas USB", 80.0,1);
        Produto p10 = new Produto("Pilha Panasonic", 8.0,1);


        p1.visualizar();
        p2.visualizar();
        p3.visualizar();
        p4.visualizar();
        p5.visualizar();
        p6.visualizar();
        p7.visualizar();
        p8.visualizar();
        p9.visualizar();
        p10.visualizar();


    }
}
