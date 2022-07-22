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
                return target;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else if(arr[mid]>target){
                possibleAns=arr[mid];
                right=mid-1;
            }
        }
        return possibleAns;
    }
}
