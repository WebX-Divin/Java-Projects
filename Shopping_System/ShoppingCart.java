package Shopping_System;

public class ShoppingCart extends ShoppingList{
    public static double price(String item_name){
        double price = 0;
        if (item_name == "Fruits") {
            price = 20.57;
        } else if(item_name == "Vegetables"){
            price = 18.09;
        } else if(item_name == "Oils"){
            price = 50.10;
        } else if(item_name == "Nuts"){
            price = 120.20;
        } else if(item_name == "Drinks"){
            price = 26.23;
        }
        return price;
    }
}
