package br.com.hamburgueria.model;

public class ItemCardapio {
    private String nome;
    private double preco;
    private String categoria;

    public ItemCardapio(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return String.format("[%s] %s - R$ %.2f", categoria, nome, preco);
    }
}