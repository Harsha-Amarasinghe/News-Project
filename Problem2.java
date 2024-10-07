import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem2{
    public static void main(String[] args) {
        List <String> numbers= Arrays.asList("1","2","3");
        List <String> letters= Arrays.asList("a","b","c");
        combinator(numbers, letters);
    }

    public static void combinator(List<String> numbers, List<String> letters){
        ArrayList<String> newList=new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            newList.add(numbers.get(i));
            newList.add(letters.get(i));
        }

        System.out.println(newList);
    }
}