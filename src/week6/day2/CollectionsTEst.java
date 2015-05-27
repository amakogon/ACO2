package week6.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsTEst {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(5);
    list.add(1);

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();

    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(5);
    set.add(1);
    for (Integer integer : set){
      System.out.print(integer + " ");
    }
    System.out.println();
  }
}
