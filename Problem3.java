
import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {

        int boundary=10;

        ArrayList<Integer> fib=new ArrayList<>();

        for (int i = 0; i < boundary; i++) {
            if (i==0) {
                fib.add(i);
            } else if (i==1) {
                fib.add(i);
            } else {
                int nextfib=fib.get(i-1)+fib.get(i-2);
                fib.add(nextfib);
            }
        }

        System.out.println(fib);

    }
}