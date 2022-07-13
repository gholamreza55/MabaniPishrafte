package shop;

import java.util.List;

public interface ShoppingDAO {
    List<Item> FindAllitems();

    void saveItems(List<Item> items);
}
