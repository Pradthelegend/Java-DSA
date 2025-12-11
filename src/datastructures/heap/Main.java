package datastructures.heap;

public class Main {

    //DSA Question-Kth Smallest Element in an Array
    public static int findKthSmallest(int[] nums,int k){
//        if (nums.length==0) return ;
        if (nums.length==1) return nums[0];
        Heap heap = new Heap();
        for (Integer i : nums){
            heap.insert(i);
        }
//        System.out.println(heap);
        for (int i = 0; i <k-1 ; i++) {
            heap.remove();
        }
        return heap.remove();
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
