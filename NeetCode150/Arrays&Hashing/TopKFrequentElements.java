import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums.length == k){
            return nums;
        }

        Map<Integer,Integer> count = new HashMap<Integer,Integer>();

        for(int num:nums){
            count.put(num,count.getOrDefault(num, 0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<Integer>(
            (a,b) -> count.get(a) - count.get(b)
        );

        for(int n:count.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] ans = new int[k];

        for(int i=0;i<k;i++){
            ans[i] = heap.poll();
        }

        return ans;
    }

    public static void main(String[] args) {
        TopKFrequentElements caller = new TopKFrequentElements();
        int[] arr = new int[]{1,1,1,2,2,3};
        int[] frequentElements = caller.topKFrequent(arr, 2);

        for(int num:frequentElements){
            System.out.print(num+" ");
        }
    }
}
