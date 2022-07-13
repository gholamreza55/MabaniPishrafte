package shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    private shoppingservice shoppingservice;
    private List<Item> itemList;

    @BeforeEach
    void setUp() {
        shoppingservice = new shoppingserviceImpl(new ShoppingDAOImpl());
        List<Item> itemList = new LinkedList<>();
    }

    @Test
    void shold_check_if_item() {
        itemList = new LinkedList<>();
        itemList.add(new Item("Banana", 5));
        itemList.add(new Item("Orange", 2));
        assertDoesNotThrow(() -> shoppingservice.saveItems(itemList));
    }

    @Test
    void should_throw_item() {
        itemList = new LinkedList<>();
        itemList.add(new Item("Banana", 5));
        itemList.add(new Item(null, 2));
        assertThrows(ItemNameException.class, () -> shoppingservice.saveItems(itemList));
    }
    @Test
    void should_throw_item_rmpty() {
        itemList = new LinkedList<>();
        itemList.add(new Item("", 5));
        itemList.add(new Item("Orange", 2));
        assertThrows(ItemNameException.class, () -> shoppingservice.saveItems(itemList));
    }
    @Test
    void should_throw_item_quantity() {
        itemList = new LinkedList<>();
        itemList.add(new Item("", 5));
        itemList.add(new Item("Orange", 2));
        assertThrows(ItemNameException.class, () -> shoppingservice.saveItems(itemList));
    }
    @Test
    void should_throw_item_quantity1 () {
        itemList = new LinkedList<>();
        itemList.add(new Item("Banana", 0));
        itemList.add(new Item("Orange", 2));
        assertThrows(ItemQuantityException.class, () -> shoppingservice.saveItems(itemList));
    }
    @Test
    void should_throw_item_quantity100 () {
        itemList = new LinkedList<>();
        itemList.add(new Item("Banana", 20));
        itemList.add(new Item("Orange", 101));
        assertThrows(ItemQuantityException.class, () -> shoppingservice.saveItems(itemList));
    }
}
