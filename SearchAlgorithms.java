public class SearchAlgorithms {
    public static int linearSearch(int[] array, int value){
        //O(n) complexity
        
        int index = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == value)
                index = i;
        }

        return index;
    }

    public static int binarySearch(int[] sortedArray, int target){
        //O(log2N) complexity
        int high = sortedArray.length-1; 
        int low = 0;
        int value;
        int middle;

        while(low<=high){

            middle = (high+low)/2;//Find the middle index
            value = sortedArray[middle];//Get the value at the middle index

            if(target > value)
                low = middle+1;//Move low up
            else if(target < value)
                high = middle-1;//Move high down
            else
                return middle;//Return the index if target is found

        }

        return -1;//Return -1 if the target is not found
    } 
}
