package datastructures.set;

import java.util.*;

public class Main {

    //DSA Question-Remove Duplicates ( ** Interview Question)
    public static List<Integer> removeDuplicates(List<Integer> myList){
        Set<Integer> set = new HashSet<>(myList);
        return new ArrayList<>(set);
    }

//    //DSA Question-Has Unique Chars ( ** Interview Question)
//    public static boolean hasUniqueChars(String inputString){
//        Set<Character> uniqueSet = new HashSet<>();
//        char[] chars = inputString.toCharArray();
//
//        for (char c : chars){
//            if (uniqueSet.contains(c)){
//                return false;
//            }
//            uniqueSet.add(c);
//        }
//        return false;
//    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates(Arrays.asList(1,4,1,5,6,8,5)));
    }
}
