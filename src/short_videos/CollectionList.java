package short_videos;

import java.util.*;

public class CollectionList {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();


        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,1,1,1));
        System.out.println("List");
        System.out.println(list);

        HashSet<Integer> hashSet = new HashSet<>();

        Set<Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(9,1,8,3,2));
        System.out.println("set");
        System.out.println(set);


    }
}
