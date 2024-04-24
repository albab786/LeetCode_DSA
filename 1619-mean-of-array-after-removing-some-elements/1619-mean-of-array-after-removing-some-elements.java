class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
       int toRemove=arr.length * 5/100;
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i =0;i<toRemove;i++){
            sum-=arr[i];
        }
        for (int i=arr.length-1; i>= arr.length-toRemove; i--){
            sum -= arr[i];
        }
        int len=arr.length-(2*toRemove);
        double mean=(double)sum/(double)len;
        return mean;

    }
}