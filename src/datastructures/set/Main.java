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

        for (char c : inputString.toCharArray()){
            if (charSet.contains(c)){
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates(Arrays.asList(1,4,1,5,6,8,5)));
    }
}
