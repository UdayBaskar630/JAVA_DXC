package ArrayList;

import java.util.ArrayList;

class Order 
{
    private ArrayList<String> items;

    public Order(ArrayList<String> items)
    {
        this.items = items;
    }

    public ArrayList<String> getItems() 
    {
        return items;
    }
}

public class ArrayList_Restaurant
{
    public static void main(String[] args) 
    {
        ArrayList<Order> orders = new ArrayList<Order>();

      
        ArrayList<String> items1 = new ArrayList<String>();
        items1.add("Idly");
        items1.add("Vada");
        items1.add("Tea");
        Order order1 = new Order(items1);
        orders.add(order1);

        ArrayList<String> items2 = new ArrayList<String>();
        items2.add("Puri");
        items2.add("Pongal");
        items2.add("Coffee");
        Order order2 = new Order(items2);
        orders.add(order2);

        ArrayList<String> items3 = new ArrayList<String>();
        items3.add("Masala Dosa");
        items3.add("Tea");
        Order order3 = new Order(items3);
        orders.add(order3);


        ArrayList<String> allItems = getItems(orders);
        System.out.println("List of items in all the orders:");
        for (String item : allItems)
        {
            System.out.println(item);
        }
    }

    public static ArrayList<String> getItems(ArrayList<Order> orders) 
    {
        ArrayList<String> allItems = new ArrayList<String>();

        for (Order order : orders)
        {
            ArrayList<String> items = order.getItems();

            for (String item : items)
            {
                if (!allItems.contains(item)) 
                {
                    allItems.add(item);
                }
            }
        }

        return allItems;
    }
}
