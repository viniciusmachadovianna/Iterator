package br.com.hamburgueria;
import br.com.hamburgueria.iterator.CardapioFastFood;
import br.com.hamburgueria.iterator.MenuIterator;
import br.com.hamburgueria.model.ItemCardapio;

public class Main {
    public static void main(String[] args) {
        CardapioFastFood cardapio = new CardapioFastFood();
        
        cardapio.adicionarItem("Combo Burger Duplo", 35.90, "Hambúrguer");
        cardapio.adicionarItem("Batata Frita Grande", 14.50, "Acompanhamento");
        cardapio.adicionarItem("Refrigerante Refil", 9.00, "Bebida");

        // O cliente consome apenas as interfaces abstractas
        MenuIterator iterator = cardapio.criarIterator();

        System.out.println("=== CARDÁPIO FAST FOOD ===");
        while (iterator.hasNext()) {
            ItemCardapio item = iterator.next();
            System.out.println(item);
        }
    }
}