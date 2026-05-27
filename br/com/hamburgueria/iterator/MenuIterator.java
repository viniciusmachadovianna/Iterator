package br.com.hamburgueria.iterator;
import br.com.hamburgueria.model.ItemCardapio;

public interface MenuIterator {
    boolean hasNext();
    ItemCardapio next();
}