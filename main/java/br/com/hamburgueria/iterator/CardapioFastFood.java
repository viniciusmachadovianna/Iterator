package java.br.com.hamburgueria.iterator;

import java.br.com.hamburgueria.model.ItemCardapio;
import java.util.ArrayList;
import java.util.List;

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