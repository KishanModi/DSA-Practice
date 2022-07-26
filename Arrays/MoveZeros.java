class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        for(int n: arr){
            if(n!=0){
                arr[i++] = n;
            }
        }
        while(i<arr.length){
            arr[i++]=0;
        }
    }
}


//first try
 // public void moveZeroes(int[] nums) {
 //        int i=0;
 //        int countZero=0;
 //        for(int n:nums){
 //            if(n==0){
 //                countZero++;
 //            }else{
 //                nums[i++] = n;
 //            }
 //        }
 //        while(i<nums.length){
 //            nums[i++]=0;
 //        }
 //    }


// class Solution {
//     public void moveZeroes(int[] arr) {
//         int i=0;
//         int pos=0;
//         while(i<arr.length){
//             if(arr[i]!=0){
//                 int temp = arr[i];
//                 arr[i++] = arr[pos];
//                 arr[pos++] = temp;
//             }else{
//                 i++;
//             }
//         }
//     }
// }
