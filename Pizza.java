// (i) Using Variable Arguments
class PizzaVarArgs {
    public static void orderPizza(String size, String... toppings) {
        System.out.println("Pizza Size: " + size);
        System.out.print("Toppings: ");
        if (toppings.length == 0)
            System.out.println("None");
        else{
            for (int i=0; i<toppings.length; i++) {
                System.out.print(toppings[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
		orderPizza("Large", "Pepperoni", "Mushrooms", "Olives");
        orderPizza("Medium");
    }
}

// (ii) Using Command-Line Arguments
class PizzaCmdLine {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide size and optional toppings.");
            return;
        }
        String size = args[0];
        System.out.println("Pizza Size: " + size);
        System.out.print("Toppings: ");
        if (args.length == 1) {
            System.out.println("None");
        } else {
            for (int i = 1; i < args.length; i++) {
                System.out.print(args[i] + " ");
            }
            System.out.println();
        }
    }
}
