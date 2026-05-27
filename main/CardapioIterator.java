


import java.util.List;

public class CardapioIterator implements MenuIterator {
    private List<ItemCardapio> itens;
    private int posicao = 0;

    public CardapioIterator(List<ItemCardapio> itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        return posicao < itens.size() && itens.get(posicao) != null;
    }

    @Override
    public ItemCardapio next() {
        ItemCardapio item = itens.get(posicao);
        posicao++;
        return item;
    }
}