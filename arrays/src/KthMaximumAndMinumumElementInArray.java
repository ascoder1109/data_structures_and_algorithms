
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthMaximumAndMinumumElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(kthMaximumElement(arr, 3));
        System.out.println(kthMinimumElement(arr, 3));

    }
    static int kthMaximumElement(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = arr.length;
        for(int i = 0 ; i<k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k  ; i < n ; i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    static int kthMinimumElement(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int n = arr.length;
        for(int i = 0 ; i<k ; i++){
            pq.add(arr[i]);
        }
        for(int i = k  ; i < n ; i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
