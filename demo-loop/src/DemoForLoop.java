public class DemoForLoop {
    public static void main(String[] args) {

        int x = 2;
        // (counter initialization初始化(int i = 0) ; counter's continue codition狀態 ; conter's movement)
        // Step 1: int i = 0
        // Step 2: i < 4 ???
        // Step 3: Yes-> x*=2
        // Step 4: print out
        // Step 5: i++
        // Step 6: i < 4 ?? i is 1
        // Step 7: Yes -> x*=2
        // Step 8: print out
        // Step 9: i++
        // Step 10: i < ?? i is 2
        // Step 11: Yes -> x*=2
        // Step 12: print out
        // Step 13: i++
        // Step 14: i < ?? i is 3
        // Step 15: Yes -> x*=2
        // Step 16: print out
        // Step 17: i++
        // Step 18: i < ?? i is 4
        // Step 19: No -> exit loop
        for (int i = 0; i < 4; i++) { // 0,1,2,3
            x *= 2;
            System.out.println("x=" + x);
        }
        // x *= 2;
        // System.out.println("x=" + x);
        // x *= 2;
        // System.out.println("x=" + x);
        // x *= 2;
        // System.out.println("x=" + x);
        // x *= 2;
        // System.out.println("x=" + x);


        // 0 + 1 + 2 + 3 + 4 + ... + 10 -> total
        int total = 0;
        for (int i = 0; i < 11; i++) {
            total += i;
        }
        System.out.println("total = " + total); // 55

        // 0 + 2 + 4 + ... + 10 -> total
        int total2 = 0;
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                total2 += i;
            }
        }
        System.out.println("total2 = " + total2); // 30


        // 0 - 100
        // i) 0 - 50, odd -> sum1
        // ii) 51 - 100, even -> another sum2
        // total -> sum1 * sum2
        total = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 101; i++) {
            if (i < 50 && i % 2 > 0) {
                sum1 += i;
            } else if (i > 50 && i % 2 == 0) {
                sum2 += i;
            }
        }
        total = sum1 * sum2;
        System.out.println("Number=" + total);

        // continue
        // sum up all odd number (0-100)
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            // skip even number : continue
            if (i % 2 == 0) // EVEN NUM NOW
                continue; // Go to the next interation(EVEN>ODD), skip the rest of codes
            // For even number, the following code will be skipped
            sum += i;
        }
        System.out.println("sum = " + sum);

        // continue -> Go to the next interaction of i
        for (int i = 0; i < 4; i++){
            if (i == 2){
            continue;
            }
            System.out.println("i= " + i);
        }

        // break
        // sum up all odd number (0-100)
        // i) sum <= 200
        // The loop should be ended at which number if i?
        int i = 0;
        int sum3 = 0;

        for (i = 0; i < 101; i++){
            
            if( i % 2 == 1){ 
                sum3 += i;   
            }
            if (sum3 <= 200 && (sum3 + i) > 200){
                break;
            }
        }
               
        System.out.println("i = "+i+" sum3 = "+sum3);



}



}


