import java.util.*;

public class MenuSystem {

    static class MenuItem {
        String name;
        String description;
        double price;

        MenuItem(String name, String description, double price) {
            this.name = name;
            this.description = description;
            this.price = price;
        }

        void display() {
            System.out.printf("%-20s $%.2f\n%s\n\n", name, price, description);
        }
    }

    public static void main(String[] args) {
        Map<String, List<MenuItem>> menu = new LinkedHashMap<>();

        menu.put("Pizzas", Arrays.asList(
                new MenuItem("Pepperoni Pizza", "Classic pepperoni with mozzarella and tomato sauce", 12.99),
                new MenuItem("Veggie Pizza", "Topped with bell peppers, onions, mushrooms, and olives", 11.49),
                new MenuItem("BBQ Chicken Pizza", "Grilled chicken, BBQ sauce, and red onions", 13.99)
        ));

        menu.put("Sandwiches", Arrays.asList(
                new MenuItem("Italian Sub", "Salami, ham, pepperoni, lettuce, and Italian dressing", 8.49),
                new MenuItem("Turkey Club", "Sliced turkey, bacon, lettuce, and tomato on toasted bread", 8.99)
        ));

        menu.put("Sides", Arrays.asList(
                new MenuItem("Garlic Bread", "Toasted bread with garlic butter and herbs", 3.99),
                new MenuItem("Mozzarella Sticks", "Fried cheese sticks served with marinara sauce", 5.49)
        ));

        menu.put("Beverages", Arrays.asList(
                new MenuItem("Soft Drink", "Choice of Coke, Sprite, or Fanta (16 oz)", 1.99),
                new MenuItem("Bottled Water", "16 oz purified bottled water", 1.49)
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Code Crust Pizza Shop!\n");

        for (Map.Entry<String, List<MenuItem>> entry : menu.entrySet()) {
            System.out.println("--- " + entry.getKey() + " ---");
            for (MenuItem item : entry.getValue()) {
                item.display();
            }
        }

        scanner.close();
    }
}