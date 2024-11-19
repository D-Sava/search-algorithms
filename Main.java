public class Main{
    public static void main(String[] args) {
        //testing linear search
        int[] array = {1, 5, 2, 4};

        System.out.println("\nLinear search: \n");
        System.out.println("Index of '5' is " +SearchAlgorithms.linearSearch(array, 5));
        System.out.println("Index of '4' is " +SearchAlgorithms.linearSearch(array, 4));
        System.out.println("Index of '2' is " +SearchAlgorithms.linearSearch(array, 2));
        System.out.println("Index of '1' is " +SearchAlgorithms.linearSearch(array, 1));

        //testing binary search
        int[] sortedArray = {1, 2, 3, 4};

        System.out.println("\nBinary search: \n");
        System.out.println("Index of '2' is " +SearchAlgorithms.binarySearch(sortedArray, 2));
        System.out.println("Index of '4' is " +SearchAlgorithms.binarySearch(sortedArray, 4));
        System.out.println("Index of '3' is " +SearchAlgorithms.binarySearch(sortedArray, 3));
        System.out.println("Index of '1' is " +SearchAlgorithms.binarySearch(sortedArray, 1));
    }
}