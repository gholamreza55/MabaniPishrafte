package shop;

import java.util.List;

public class shoppingserviceImpl implements shoppingservice{
    final ShoppingDAO shoppingDAO;

    public shoppingserviceImpl(ShoppingDAO shoppingDAO) {
        this.shoppingDAO = shoppingDAO;
    }

    @Override
    public List<Item> FindAllitems() {
        return shoppingDAO.FindAllitems();
    }

    @Override
    public void saveItems(List<Item> items) {
        for (Item item : items) {
            item.check();
        }
        shoppingDAO.saveItems(items);
    }
}
