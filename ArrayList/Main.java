package ArrayList;


import java.util.*;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ShoppingCart shop_cart = new ShoppingCart();
    public static void main(String[] args) {
        boolean exit = false;
        int userChoice = 0;
        printInstructions();
        while(!exit){
            System.out.println("Enter your choice ");
            userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice) {
                case 0:
                    printInstructions();
                    break;

                case 1:
                    shop_cart.printList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItem();
                    break;

                case 5:
                    searchItem();
                    break;

                case 6:
                    exit = true;
                    break;
            
                default:
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("------------Choose from the option------------");
        System.out.println("0 - To print the choices");
        System.out.println("1 - To print the Shopping list");
        System.out.println("2 - To add an item");
        System.out.println("3 - To modify an item");
        System.out.println("4 - To remove an item");
        System.out.println("5 - To exit the application");
    }

    public static void addItem(){
        System.out.println("Please enter the Shopping item");
        shop_cart.addItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter the item number");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the replacement");
        String itemName = scanner.nextLine();
        shop_cart.modifyCart(itemNumber - 1, itemName);
    }

    public static void removeItem(){
        System.out.println("Enter the item position to remove");
        int position = scanner.nextInt();
        scanner.nextLine();
        shop_cart.removeItem(position - 1);
    }

    public static void searchItem(){
        System.out.println("Insert the item to search");
        String search_item = scanner.nextLine();
        if((shop_cart.searchItem(search_item)) != null) System.out.println("Item found");
        else System.out.println("Item not found");
    }
}
