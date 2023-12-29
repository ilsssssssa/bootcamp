import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoStack {

    public static void main(String[] args) {
        // LIFO - Stack
        List<String> stack = new Stack<>();
        // If we use List as reference type, the obj ref has no push() and pop() scope

        Stack<String> ss = new Stack<>();
        ss.push("ABC");
        ss.push("IJK");
        // pop -> get the last element
        System.out.println(ss.pop()); // IJK -> Last In First Out
        System.out.println(ss.pop()); // ABC
        // System.out.println(ss.pop()); // error, We cannot pop an empty stack

        // 2. You can access the middle element
        ss.push("aaa");
        ss.push("bbb");
        ss.push("ccc");
        System.out.println(ss.get(0)); // aaa
        System.out.println(ss.get(1)); // bbb
        

        // 3. Slow
        // Stack
        // SPEED : ArrayList.add() -> Stack.push() -> LinkedList.add()
        // SPEED : LinkedList.removeFirst -> ArrayList.remove -> Stack.remove(0)
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i ++) {
            ss.push("A");
        }
        long end = System.nanoTime();
        System.out.println("Stack.push() -> " + (end - start));

        start = System.nanoTime();
        ArrayList<String> as = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            as.add("A");
        }
        end = System.nanoTime();
        System.out.println("ArrayList.add() -> " + (end - start));
    }
}

