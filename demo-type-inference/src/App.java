import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// "VAR" 用係METHOD入面 並給予value

public class App {
    public static void main(String[] args) {
        String s = "hello";
        var s2 = "hello"; // after compile: var -> String
        // dog = "dog"; // error

        // If the object reference is declared by "var", we have to assign value at the same time
        // 第一次聲明必須給出variable變數
        // var n;
        // var = null;
        // int n2;

        // s = 123; // error
        // s2 = 123; // same error, s2 is declared before, and pointing to a String object
        // cannot be reassigned to int value object

        List<Dog> dogs =
                new ArrayList<>(List.of(new Dog("ABC"), new Dog("DEF")));

        for (Dog dog : dogs) {
            System.out.println(dog.getName());
        }

        for (var dog : dogs) {
            System.out.println(dog.getName());
        }

        Map<String, Dog> dogMap = new HashMap<>();
        dogMap.put("JOHN", new Dog("ABC"));

        for (Map.Entry<String, Dog> entry : dogMap.entrySet()) {

        }
        for (var entry : dogMap.entrySet()) { // Map.Entry
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        for (var key : dogMap.keySet()) { // String
            System.out.println(key.length());
        }
        for (var value : dogMap.values()) { // Dog
            System.out.println(value.getName());
        }

    }

    public static int add(int x, int y) {
        return x + y;
    }

    // We cannot use var as return type
    // public static var add(int x, int y) {
    // return x + y;
    // }

    // We cannot use var as input param
    // public static int add (int x, int y)
    //
}
