package Shopping_Cart;

import java.util.*;
public class ShoppingCart {
    
    public int[] array = new int[10];
    public ArrayList<String> ShoppingCart = new ArrayList<>();

    public void addItem(String item){
        ShoppingCart.add(item);
    }

    public void printList(){
        System.out.println("There are " + ShoppingCart.size() + " items in your cart");
        for(int i=0;i<ShoppingCart.size();i++){
            System.out.println(ShoppingCart.get(i));
        }
    }

    public void modifyCart(int position, String newItem){
        ShoppingCart.set(position, newItem);
        System.out.println((position + 1) + " has been updated");
    }

    public void removeItem(int position){
        String itemName = ShoppingCart.get(position);
        System.out.println(itemName + " to be removed from an ArrayList");
        ShoppingCart.remove(position);
    }

    public String searchItem(String search_Item){
        int position = ShoppingCart.indexOf(search_Item);
        if(position >= 0) return ShoppingCart.get(position);
        else return null;
    }
}
