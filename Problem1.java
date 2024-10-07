
import java.util.Arrays;
import java.util.List;

class Problem1{
    public static void main(String[] args) {

        List <Integer> numbers= Arrays.asList(1,2,3);

        System.out.println(forLoop(numbers));
        System.out.println(whileLoop(numbers));
        System.out.println(recursion(numbers, 0));

    }

    public static int forLoop(List<Integer> numbers){
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }
    public static int whileLoop(List<Integer> numbers){
        int sum=0;
        int i=0;
        while (i<numbers.size()) {
            sum+=numbers.get(i);
            i++;
        }
        return sum;
    }
    public static int recursion(List<Integer> numbers, int index){
        if (index==numbers.size()) {
            int sum=0;
            int i=0;
            while (i<numbers.size()) {
                return 0;
            }
        }
        return numbers.get(index)+recursion(numbers, index+1);
    }
}