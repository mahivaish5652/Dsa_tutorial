import java.util.HashMap;
import java.util.*;
//import java.lang.String;
public class Map_Interface_methods {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        mapping.put("br", "brazil");
        mapping.put("us", "united state");
        System.out.println(mapping);
        Map<String, String> table = new HashMap<>();
        table.put("au", "australia");
        System.out.println(table);
        table.putAll(mapping);
        System.out.println(table);
        table.putIfAbsent("ru", "russia");
        table.putIfAbsent("in", "indonesia");
        System.out.println(table);
        System.out.println(table.get("au"));
        System.out.println(table);
        System.out.println(mapping.getOrDefault("id", "indonesia"));
        System.out.println(mapping.containsKey("id"));
        System.out.println(mapping.containsValue("India"));
    }
}