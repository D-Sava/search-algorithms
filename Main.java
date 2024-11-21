public class Main{
    public static void main(String[] args) {
        long start, end, result;
        int index;

        //generating random datasets: 10, 100, 1000, 10000
        int[] randomDataset_10 = generateRandomArray(10);
        int[] randomDataset_100 = generateRandomArray(100);
        int[] randomDataset_1000 = generateRandomArray(1000);
        int[] randomDataset_10000 = generateRandomArray(10000);

        //generating sorted datasets: 10, 100, 1000, 10000
        int[] sortedDataset_10 = generateSortedArray(10);
        int[] sortedDataset_100 = generateSortedArray(100);
        int[] sortedDataset_1000 = generateSortedArray(1000);
        int[] sortedDataset_10000 = generateSortedArray(10000);

        //testing linear search: array of 10 elements
        start = System.currentTimeMillis();
        index = SearchAlgorithms.linearSearch(randomDataset_10, 5);
        end = System.currentTimeMillis();
        calculateAlgorithmEfficiency(start, end, "Linear Search", 10);

         //testing linear search: array of 100 elements
         start = System.currentTimeMillis();
         index = SearchAlgorithms.linearSearch(randomDataset_100, 50);
         end = System.currentTimeMillis();
         calculateAlgorithmEfficiency(start, end, "Linear Search", 100);

         //testing linear search: array of 1000 elements
         start = System.currentTimeMillis();
         index = SearchAlgorithms.linearSearch(randomDataset_1000, 30);
         end = System.currentTimeMillis();
         calculateAlgorithmEfficiency(start, end, "Linear Search", 1000);

         //testing linear search: array of 10000 elements
         start = System.currentTimeMillis();
         index = SearchAlgorithms.linearSearch(randomDataset_10000, 70);
         end = System.currentTimeMillis();
         calculateAlgorithmEfficiency(start, end, "Linear Search", 10000);

        //testing binary search

    }

    public static int[] generateRandomArray(int limit){
        int[] array = new int[limit];

        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }

        return array; 
    }

    public static int[] generateSortedArray(int limit){
        int[] array = new int[limit];

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        return array;
    }

    public static void calculateAlgorithmEfficiency(long start, long end, String algorithm, int input){
        long result = end - start;
        System.out.println("\n"+algorithm + " execution time for dataset of " +input+ " elements is: " +result + "ms");

        if(result < 1)
            System.out.println("Great performance.");
        else if(result < 4)
            System.out.println("Good performance.");
        else
            System.out.println("Bad performance.\n");
    }
}