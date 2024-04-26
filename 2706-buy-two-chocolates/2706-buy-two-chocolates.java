class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(prices[1]+prices[0]-money<=0){
            return Math.abs(prices[1]+prices[0]-money);
        }
        return money;
    }
}