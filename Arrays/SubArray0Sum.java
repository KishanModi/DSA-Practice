
// https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        Set<Integer> set = new HashSet<>();
        
        int sum = 0;
        set.add(sum);
        
        int i=0;
        while(i<n){
            sum = sum+arr[i];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
            i++;
        }
        return false;
    }
}
