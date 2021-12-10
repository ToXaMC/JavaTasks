package Task31and32;

public interface OrdersManager {

    int itemsQuantity(String itemName);

    int itemsQuantity(MenuItem item);

    Order[] getOrders();

    int ordersCostSummary();

    int ordersQuantity();

}