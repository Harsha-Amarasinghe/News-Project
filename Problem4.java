// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;
// import java.util.List;

// public class Problem4 {

//     public static void main(String[] args) {
//         List <Integer> numbers= Arrays.asList(1,20,3,4);
//         ArrayList<Integer> newList=new ArrayList<>();

//         for(Integer number:numbers){
//             if (number>10) {
//                 int temp=number;
//                 temp=temp / 10;
//                 newList.add(temp);
//             } else if (number>100) {
//                 int temp=number;
//                 temp=temp / 100;
//                 newList.add(temp);
//             } else {
//                 newList.add(number);
//             }
//         }
//             newList.sort((Comparator<? super Integer>) newList);
            
//             System.out.println(newList);
//         }
//     }
    
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem4 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 200, 3, 4, 150);
        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > 100) { 
                int temp = number;
                temp = temp / 100;
                newList.add(temp);
            } else if (number > 10) {
                int temp = number;
                temp = temp / 10;
                newList.add(temp);
            } else {
                newList.add(number);
            }
        }
        
        // Sort in natural ascending order
        newList.sort(Comparator.naturalOrder());
        
        System.out.println(newList);
    }
}
