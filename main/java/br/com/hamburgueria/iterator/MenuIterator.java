package java.br.com.hamburgueria.iterator;
import java.br.com.hamburgueria.model.ItemCardapio;

public interface MenuIterator {
    boolean hasNext();
    ItemCardapio next();
}