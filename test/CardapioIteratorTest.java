public class CardapioIteratorTest {

    private CardapioFastFood cardapio;

    @BeforeEach
    public void setUp() {
        cardapio = new CardapioFastFood();
    }

    @Test
    public void deveIterarCorretamentePorTodosOsItens() {
        cardapio.adicionarItem("Burger 1", 25.0, "Hambúrguer");
        cardapio.adicionarItem("Batata", 10.0, "Acompanhamento");
        MenuIterator iterator = cardapio.criarIterator();

        assertTrue(iterator.hasNext(), "Deveria ter o primeiro item");
        
        ItemCardapio item1 = iterator.next();
        assertEquals("Burger 1", item1.getNome());

        assertTrue(iterator.hasNext(), "Deveria ter o segundo item");
        
        ItemCardapio item2 = iterator.next();
        assertEquals("Batata", item2.getNome());

        assertFalse(iterator.hasNext(), "Não deveria ter mais itens");
    }

    @Test
    public void deveRetornarFalsoParaHasNextEmCardapioVazio() {
        MenuIterator iterator = cardapio.criarIterator();

        assertFalse(iterator.hasNext(), "Cardápio vazio não deve ter próximo item");
    }

    @Test
    public void doisIteratorsDevemSerIndependentes() {
        cardapio.adicionarItem("Burger 1", 25.0, "Hambúrguer");
        MenuIterator iterator1 = cardapio.criarIterator();
        MenuIterator iterator2 = cardapio.criarIterator();

        iterator1.next();

        assertFalse(iterator1.hasNext(), "Iterator 1 deveria estar no fim");
        assertTrue(iterator2.hasNext(), "Iterator 2 deveria ser independente e ainda ter o item");
    }
}