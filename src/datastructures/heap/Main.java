package datastructures.heap;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    //DSA Question-Kth Smallest Element in an Array
    public static int findKthSmallest(int[] nums,int k){

        Heap maxHeap = new Heap();
        for (Integer i : nums){
            maxHeap.insert(i);
            if (maxHeap.getHeap().size() > k){
                maxHeap.remove();
            }
        }
        return maxHeap.remove();
    }

    public static void main(String[] args) {

//        Heap heap = new Heap();
//
//        heap.insert(1);
//        heap.insert(2);
//        heap.insert(3);
//        heap.insert(4);
//        heap.insert(5);
//        heap.insert(6);
//        heap.insert(7);
//
//        //        heap.remove();
//        System.out.println(heap.getHeap());

        System.out.println(findKthSmallest(new int[] {1,8,5,9,3,6,10},2));
    }
}
