// search the next large number of target in the array.
public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,13,14,17,18};
        System.out.println(search(arr, 4));
    }
    
    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int possibleAns=0;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                // mid element is our actual answer.
                return target;
            }
            else if(arr[mid]<target){
                // answer would lay on the right half of the array cause mid element is less than target.
                // at the end if there is only one element in the array, and target is still greater than the current mid element,
                // this will make the left greater than the right and break the loop and our possible answer would be returend.
                left=mid+1;
            }
            else if(arr[mid]>target){
                //storing the possible answer here, if mid element is greater than the target there would
                // be a chance that this number is our possible answer
                // then we look for another pottential answer by looking on the left side of the mid
                // if we dont find any number between the possible answer and target
                // then possible answer is our actual answer
                possibleAns=arr[mid];
                right=mid-1;
            }
        }
        return possibleAns;
    }
}
