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
        int value = 0;
        int middle;

        while(low<=high){

            middle = (high+low)/2;
            value = sortedArray[middle];

            if(target > value)
                low = middle-1;
            else if(target < value)
                high = middle+1;
            else
                return value;

        }

        return -1;
    }
}
