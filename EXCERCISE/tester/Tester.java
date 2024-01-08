import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tester {
  public static void main(String[] args) {
    
  }

    public List<Integer> findPeaks(int[] mountain) {
        List <Integer> peaks = new LinkedList<>();
        for (int i = 0; i < mountain.length; i++) {
          if (i > 0 && i < mountain.length - 1) {
            if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
              peaks.add(i);
            }
          }
        }
        return peaks;
    }








}
