package Shopping_System;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------Please choose the Product------------");
        System.out.println("Press 1 for Fruits ");
        System.out.println("Press 2 for Vegetables ");
        System.out.println("Press 3 for Oils ");
        System.out.println("Press 4 for Nuts ");
        System.out.println("Press 5 for Drinks ");
        int product = scanner.nextInt();
        
        scanner.close();
    }
}