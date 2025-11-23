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

    //DSA Question-Find Pairs ( ** Interview Question)
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target){
        Set<Integer> set = new HashSet<>();
        List<int[]> list = new ArrayList<>();
        for (Integer i : arr1){
            set.add(i);
        }

        for (Integer j : arr2){
            int complement = target - j;
            if (set.contains(complement)){
                list.add(new int[] {complement,j});
            }
        }
        return list;
    }

    //DSA Question-Longest Consecutive Sequence ( ** Interview Question)
    public static int longestConsecutiveSequence(int[] inputArray){
        Set<Integer> set = new HashSet<>();

        for (Integer i : inputArray){
            set.add(i);
        }

        int currentStreak=0;
        int longestStreak=0;

        for (Integer j : inputArray){
            currentStreak = 0;
            if (set.contains(j-1)) currentStreak = 1;
            if (set.contains(j+1)) longestStreak = 1;

        }


        return 1;
    }


    public static void main(String[] args) {

//        System.out.println(removeDuplicates(Arrays.asList(1,4,1,5,6,8,5)));//DSA Question-Remove Duplicates ( ** Interview Question)

//        System.out.println(hasUniqueChars("Suces"));//DSA Question-Has Unique Chars ( ** Interview Question)


        //DSA Question-Find Pairs ( ** Interview Question)
        List<int[]> pairs = findPairs(new int[] {1,2,3}, new int[] {3,4,5}, 6);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }


    }
}
