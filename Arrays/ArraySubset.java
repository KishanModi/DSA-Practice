//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
//Array Subset of another array
void rearrange(int arr[], int n) {
    
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        
        int i=0;
        while(i<n){
            if(arr[i]>=0){
                positives.add(arr[i]);
            }else{
                negatives.add(arr[i]);
            }
            i++;
        }
        int j=0;
        int k=0;
        Boolean isPos=true;
        i=0;
        while(j<positives.size() && k<negatives.size()){
            if(isPos){
                arr[i++] = positives.get(j++);
                isPos=false;
            }else{
                arr[i++] = negatives.get(k++);
                isPos=true;
            }
        }
        while(j<positives.size()){
            arr[i++] = positives.get(j++);
        }
        while(k<negatives.size()){
            arr[i++] = negatives.get(k++);
        }
    }
