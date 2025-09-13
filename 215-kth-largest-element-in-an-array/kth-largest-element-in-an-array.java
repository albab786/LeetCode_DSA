class Solution {
    public int findKthLargest(int[] arr, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); // remove smallest
            }
        }

        
        return pq.peek();
    }
}