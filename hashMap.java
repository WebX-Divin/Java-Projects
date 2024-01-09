import java.util.*;
public class hashMap {

    public static void main(String[] args) {
        Map<String, String> listMap = new HashMap<>();
        listMap.put("Sara", "Sister");
        listMap.put("Rasitha", "ESister");
        listMap.put("Wahith", "YBrother");

        for(String key : listMap.keySet()){
            System.out.println(key + " - " + listMap.get(key));
        }
    }
}
