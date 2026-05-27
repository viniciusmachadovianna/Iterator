package br.com.hamburgueria.iterator;

import java.util.ArrayList;
import java.util.List;

import br.com.hamburgueria.model.ItemCardapio;

public class CardapioFastFood implements MenuAgregator {
    private List<ItemCardapio> itens;

    public CardapioFastFood() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, String categoria) {
        ItemCardapio item = new ItemCardapio(nome, preco, categoria);
        itens.add(item);
    }

    @Override
    public MenuIterator criarIterator() {
        return new CardapioIterator(this.itens);
    }
}