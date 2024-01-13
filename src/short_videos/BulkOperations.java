package short_videos;

import java.util.*;

public class BulkOperations {

    public static void main(String[] args) {

        System.out.println("================");

        ArrayList<String> strList = new ArrayList<>();

        ArrayList<Integer> numList = new ArrayList<>();
        //numList.add(1);
        numList.addAll(Arrays.asList(1,2,3,4,5));

//        numList.remove(0);
//        numList.removeAll(Arrays.asList(1,2,3));
//
//        numList.contains(3);
//        numList.containsAll(Arrays.asList(1,2,3));

         // 1st way
        for (int i=0; i< numList.size(); i++){
            System.out.println(numList.get(i));
        }
        System.out.println("====================");

        // 2nd way
        for (Integer i : numList){
            System.out.println(i);
        }
        System.out.println("===================");

        // 3rd
        numList.forEach(i -> System.out.println(i));





        // Bulk operations in Java refer to a set of operations that can be performed
        // on a collection as a whole, rather than operating on individual elements one by one.


        // Some commonly used bulk operations in Java include:
        // addAll()
        // removeAll()
        // containsAll()
        // retainAll()


        // forEach()


    }
}
