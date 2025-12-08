package datastructures.heap;

public class Main {

    public static void main(String[] args) {

        Heap heap = new Heap();

        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
        heap.insert(7);


//        heap.remove();
        System.out.println(heap.getHeap());

    }
}
