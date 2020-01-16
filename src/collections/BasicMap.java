package collections;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicMap {
    public static <Entry> void main(String[] args) {
        Map<String,String>data = new HashMap<>();
        data.put("A","A");
        data.put("B","B");
        data.put(null,"C");
        data.put("D",null);
        data.put("D","D");

        System.out.println(data);

        String value = data.get(null);
        System.out.println("Key = null,Value = " + value);

        value = data.get("M");
        System.out.println("Key = M,Value = "+ value);

        boolean keyExists = data.containsKey(null);
        boolean valueExists = data.containsValue(null);
        System.out.println(keyExists + " " + valueExists);

        System.out.println("data map size is " + data.size());



    }
}
