import java.util.ArrayList;

public class autoBoxing_UnBoxing {
    public static void main(String[] args) {
        
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for(double i=0.0;i<=10.0;i+=0.5){
            doubleArrayList.add(Double.valueOf(i)); //auto-boxing 
        }

        for(int i=0;i<=10;i++){
            System.out.println(i + " is " + doubleArrayList.get(i).doubleValue()); //unboxing
        }
    }
}
