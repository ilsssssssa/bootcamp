public class DemoWhileLoop {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);

        int j = 0;
        sum = 0;
        while (j < 5) {
            sum += j++;
        }
        System.out.println("sum=" + sum + ", j=" + j);

        // continue, break
        // 1, 3, 5, 7, 9 (1 - 10)
        j = 0;
        while (++j <= 10) {
            if (j > 5)
                break;
            if (j % 2 == 0)
                continue;
            System.out.println(j);
        }

        int x = 10;
        int y = 5;
        while (x > 0 && y > 0) {

            System.out.println("x=" + x + ", y=" + y);
            y--;
            x--;
            // x=10, y=5
            // x=9, y=4
            // x=8, y=3
            // x=7, y=2
            // x=6, y=1
        }

        // 1 1 2 3 5 8 13 ... 1000
        int a1 = 1;
        int a2 = 1;
        int e = 0;

        while (e <= 1000) {
         a2 = a1;
         a1 = e;
        e = a1 + a2;
        if (e < 1000)
        System.out.print(e + " ");
    } 
    // Approach 2

    }
}


