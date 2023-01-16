package Cadastros.model;

public class Produto {

    private String produto;
    private double valor;
    private int quantidade;


    public Produto(String produto, double valor, int quantidade) {
        this.produto = produto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void visualizar(){

        System.out.println("\n__________________________________");
        System.out.println("            PRODUTOS                ");
        System.out.println("\n Produto: "+getProduto());
        System.out.println("\n Preço: $"+getValor());
        System.out.println("\n Quantidade: "+getQuantidade());
        System.out.println("\n                                  ");
        System.out.println("\n                                  ");
        System.out.println("\n                                  ");
        System.out.println("\n__________________________________");
    }

}