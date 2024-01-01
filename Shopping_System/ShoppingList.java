package Shopping_System;

public class ShoppingList {

    public static String list(int item_code){
        String item_name = " ";
        switch (item_code) {
            case 1:
                item_name = "Fruits";
                System.out.println("Item name is " + item_name);
            case 2:
                item_name = "Vegetables";
                System.out.println("Item name is " + item_name);
            case 3:
                item_name = "Oils";
                System.out.println("Item name is " + item_name);
            case 4:
                item_name = "Nuts";
                System.out.println("Item name is " + item_name);
            case 5:
                item_name = "Drinks";
                System.out.println("Item name is " + item_name);
        
            default:
                System.out.println("Wrong item selected");
                break;
        }
        return item_name;
    }
    
}
