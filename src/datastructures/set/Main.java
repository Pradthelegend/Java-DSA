package datastructures.set;

import java.util.*;

public class Main {

    //DSA Question-Remove Duplicates ( ** Interview Question)
    public static List<Integer> removeDuplicates(List<Integer> myList){
        Set<Integer> set = new HashSet<>(myList);
        return new ArrayList<>(set);
    }

    //DSA Question-Has Unique Chars ( ** Interview Question)
    public static boolean hasUniqueChars(String inputString){
        Set<Character> charSet = new HashSet<>();

        for (char c : inputString.toLowerCase().toCharArray()){
            if (charSet.contains(c)){
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

//    //DSA Question-Find Pairs ( ** Interview Question)
//    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target){
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//
//        for (Integer i : arr1){
//            int compliment = i-target;
//            set1.add(i);
//            if (set1.contains(arr2));
//        }
//        return new ArrayList<>();
//    }


    public static void main(String[] args) {

//        System.out.println(removeDuplicates(Arrays.asList(1,4,1,5,6,8,5)));//DSA Question-Remove Duplicates ( ** Interview Question)

//        System.out.println(hasUniqueChars("Suces"));//DSA Question-Has Unique Chars ( ** Interview Question)


    }
}
