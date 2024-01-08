import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// :: == (e)

public class Demo {
    public static void main(String[] args) {
    // 1. Instance Method
    List<String> strings = new ArrayList<>(List.of("abc", "ijk", "def"));

    // length()
    List<Integer> strLengths = strings.stream() // 
    .map(e -> e.length()) //
    .collect(Collectors.toList());

    strLengths = strings.stream() // NEW METHOD
    .map(String::length) // :: == (e)
    .collect(Collectors.toList());

    // 2. Static Method
    strings.stream() //
    .forEach(e -> System.out.println(e));

    // method reference : alternative as a lambda expression
    // :: 等於= (e) !!
    strings.stream() // NEW METHOD
    .forEach(System.out::println);
     // When there is a single input, and there is only one input parameter of the method

  

    }
}
