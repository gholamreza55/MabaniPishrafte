package shop;
import java.util.List;

public interface shoppingservice {
    List<Item> FindAllitems();

     void saveItems(List<Item> items);
}
