package Phone_Directory;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        

        ArrayList<PhoneDirectory> list = new ArrayList<>();
        list.add(new PhoneDirectory("Ana", "763988"));
        list.add(new PhoneDirectory("Aditi", "398876"));
        list.add(new PhoneDirectory("Rao", "639887"));

        Collections.sort(list);
        for(PhoneDirectory obj : list){
            System.out.println(obj.getContactName() + " " + obj.getContactNumber());
        }
    }
}
