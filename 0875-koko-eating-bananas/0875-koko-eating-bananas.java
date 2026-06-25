class Solution {

    public int binary(int[] arr, int h){
        int ans=0;
        int low= 1;
        int high = arr[0];
        for(int e:arr){
            high = Math.max(high, e);
        }
        while(low<=high){
            long total=0;
            int mid = low+(high-low)/2;
            for(int e: arr){
                int t = (e + mid-1)/mid;
                total+=t;
            }
            if(total<=h){
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        //max num in piles arrat
        //apply binary search over piles, and once revceived ansert lower the high to the answer , continue until u get the minimum
        int ans = binary(piles, h);
        return ans;
    }
}